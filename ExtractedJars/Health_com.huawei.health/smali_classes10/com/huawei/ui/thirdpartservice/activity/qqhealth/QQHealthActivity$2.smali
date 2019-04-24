.class Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;)V
    .locals 0

    .line 185
    iput-object p1, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity$2;->c:Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 188
    const-string v0, "QQHealthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u7528\u6237\u53d6\u6d88\u65ad\u5f00QQHealth."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 189
    return-void
.end method
