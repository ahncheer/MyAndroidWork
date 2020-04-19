package com.lec.android.a008_practice;

import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


    public class ProfileAdapter extends RecyclerView.Adapter<ProfileAdapter.ViewHolder> {
        List<Profile> items = new ArrayList<Profile>();
        static ProfileAdapter adapter;

        public ProfileAdapter() {this.adapter = this;}

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            LayoutInflater inf = LayoutInflater.from(parent.getContext());
            View itemView = inf.inflate(R.layout.profile, parent, false);

            return new ViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            Profile item = items.get(position); // List<> 의 get()
            holder.setItem(item);
        }

        @Override
        public int getItemCount() {
            return items.size();  // List<> 의 size()
        }

        static class ViewHolder extends RecyclerView.ViewHolder{

            ImageView btnDel;
            TextView tvName, tvAge, tvAddress;


            // 생성자 필수
            public ViewHolder(@NonNull View itemView) {  // item 레이아웃의 View 객체가 전달됨.
                super(itemView);

                // View 객체 가져오기
                tvName = itemView.findViewById(R.id.tvName);
                tvAge = itemView.findViewById(R.id.tvAge);
                tvAddress = itemView.findViewById(R.id.tvAddress);

                btnDel = itemView.findViewById(R.id.btnDel);


                // 삭제 버튼 누르면 item삭제 되게 하기
                btnDel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        adapter.removeItem(getAdapterPosition());// 이건 데이터 삭제다
                        adapter.notifyDataSetChanged(); //이게ㅓ가 데이터 변경 저장 코드 !

                    }
                });

    // 클릭리스너 장착
//                itemView.setOnClickListener(new View.OnClickListener() {
////                    @Override
////                    public void onClick(View v) {
////                        int position = getAdapterPosition();
////                        Intent intent = new Intent(v.getContext(), ProfileDetail.class);
////                        intent.putExtra("pf", (Parcelable) adapter.getItem(position));
////
////                        v.getContext().startActivity(intent);
////                    }
////                });

            } // end 생성자

            // 데이터를 받아서 멤버변수 세팅
            public void setItem(Profile item){
                tvName.setText(item.getName());
                tvAge.setText(item.getAge());
                tvAddress.setText(item.getAddress());
            }


        }  // end ViewHolder

        // 데이터를 다루기 위한 메소드들
        public void addItem(Profile item) {  items.add(item); }
        public void addItem(int position, Profile item) {   items.add(position, item);}
        public void setItems(ArrayList<Profile> items) {   this.items = items;}
        public Profile getItem(int position) {   return items.get(position);}
        public void setItem(int position, Profile item) {   items.set(position, item); }
        public void removeItem(int position){ items.remove(position); }

    } // end Adapter
