@Override
public void onViewAttachedToWindow(ViewHolder holder) {
    RecyclerView recyclerView = (RecyclerView) holder.itemView.getParent();
    recyclerView.getLayoutManager().setClipToPadding(true);
    recyclerView.getLayoutManager().setClipChildren(true);
}
