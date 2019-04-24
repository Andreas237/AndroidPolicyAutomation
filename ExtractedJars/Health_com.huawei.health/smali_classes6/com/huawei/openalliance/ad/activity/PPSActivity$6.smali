.class Lcom/huawei/openalliance/ad/activity/PPSActivity$6;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/activity/PPSActivity;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

.field final synthetic b:Lcom/huawei/openalliance/ad/activity/PPSActivity;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/activity/PPSActivity;Lcom/huawei/openalliance/ad/inter/data/AppInfo;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity$6;->b:Lcom/huawei/openalliance/ad/activity/PPSActivity;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity$6;->a:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity$6;->b:Lcom/huawei/openalliance/ad/activity/PPSActivity;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity$6;->a:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/download/app/f;->a(Landroid/content/Context;Lcom/huawei/openalliance/ad/inter/data/AppInfo;)V

    return-void
.end method
