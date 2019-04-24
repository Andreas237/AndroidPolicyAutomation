.class Lcom/huawei/hwuserprofilemgr/UserInfoModifyService$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwuserprofilemgr/UserInfoModifyService;->onStartCommand(Landroid/content/Intent;II)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hwuserprofilemgr/UserInfoModifyService;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lcom/huawei/hihealth/HiUserInfo;


# direct methods
.method constructor <init>(Lcom/huawei/hwuserprofilemgr/UserInfoModifyService;Lcom/huawei/hihealth/HiUserInfo;Ljava/lang/String;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/huawei/hwuserprofilemgr/UserInfoModifyService$5;->a:Lcom/huawei/hwuserprofilemgr/UserInfoModifyService;

    iput-object p2, p0, Lcom/huawei/hwuserprofilemgr/UserInfoModifyService$5;->d:Lcom/huawei/hihealth/HiUserInfo;

    iput-object p3, p0, Lcom/huawei/hwuserprofilemgr/UserInfoModifyService$5;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 57
    iget-object v0, p0, Lcom/huawei/hwuserprofilemgr/UserInfoModifyService$5;->a:Lcom/huawei/hwuserprofilemgr/UserInfoModifyService;

    iget-object v1, p0, Lcom/huawei/hwuserprofilemgr/UserInfoModifyService$5;->d:Lcom/huawei/hihealth/HiUserInfo;

    iget-object v2, p0, Lcom/huawei/hwuserprofilemgr/UserInfoModifyService$5;->c:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/huawei/hwuserprofilemgr/UserInfoModifyService;->d(Lcom/huawei/hwuserprofilemgr/UserInfoModifyService;Lcom/huawei/hihealth/HiUserInfo;Ljava/lang/String;)V

    .line 58
    return-void
.end method
