.class Lo/bjs$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/awj$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bjs;->a(Lo/axv;)Lo/bjs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/bjs;


# direct methods
.method constructor <init>(Lo/bjs;)V
    .locals 0

    .line 132
    iput-object p1, p0, Lo/bjs$3;->a:Lo/bjs;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;)V
    .locals 2

    .line 136
    iget-object v0, p0, Lo/bjs$3;->a:Lo/bjs;

    invoke-static {v0}, Lo/bjs;->b(Lo/bjs;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->getImageURLDownload_()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bbk;->a(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 137
    return-void
.end method
