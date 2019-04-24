.class Lhuawei/widget/HwBottomNavigationView$BottomNavItemClickListenr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhuawei/widget/HwBottomNavigationView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "BottomNavItemClickListenr"
.end annotation


# instance fields
.field private itemView:Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;

.field final synthetic this$0:Lhuawei/widget/HwBottomNavigationView;


# direct methods
.method private constructor <init>(Lhuawei/widget/HwBottomNavigationView;)V
    .locals 0

    .line 785
    iput-object p1, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavItemClickListenr;->this$0:Lhuawei/widget/HwBottomNavigationView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lhuawei/widget/HwBottomNavigationView;Lhuawei/widget/HwBottomNavigationView$1;)V
    .locals 0

    .line 785
    invoke-direct {p0, p1}, Lhuawei/widget/HwBottomNavigationView$BottomNavItemClickListenr;-><init>(Lhuawei/widget/HwBottomNavigationView;)V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 790
    instance-of v0, p1, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;

    if-eqz v0, :cond_0

    .line 791
    move-object v0, p1

    check-cast v0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;

    iput-object v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavItemClickListenr;->itemView:Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;

    .line 792
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavItemClickListenr;->this$0:Lhuawei/widget/HwBottomNavigationView;

    iget-object v1, p0, Lhuawei/widget/HwBottomNavigationView$BottomNavItemClickListenr;->itemView:Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lhuawei/widget/HwBottomNavigationView;->access$400(Lhuawei/widget/HwBottomNavigationView;Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;Z)V

    .line 794
    :cond_0
    return-void
.end method
