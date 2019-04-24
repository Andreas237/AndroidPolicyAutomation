.class Lcom/huawei/pluginsocialshare/activity/EditShareActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/pluginsocialshare/activity/EditShareActivity;


# direct methods
.method constructor <init>(Lcom/huawei/pluginsocialshare/activity/EditShareActivity;)V
    .locals 0

    .line 204
    iput-object p1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity$5;->a:Lcom/huawei/pluginsocialshare/activity/EditShareActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 207
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity$5;->a:Lcom/huawei/pluginsocialshare/activity/EditShareActivity;

    invoke-virtual {v0}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->finish()V

    .line 208
    return-void
.end method
