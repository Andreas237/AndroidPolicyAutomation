.class public Lcom/huawei/hwid/usecase/GetAccountStatusUseCase;
.super Lcom/huawei/hwid/UseCase;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hwid/usecase/GetAccountStatusUseCase$RequestValues;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/hwid/UseCase<Lcom/huawei/hwid/usecase/GetAccountStatusUseCase$RequestValues;>;"
    }
.end annotation


# instance fields
.field private a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Lcom/huawei/hwid/UseCase;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/huawei/hwid/usecase/GetAccountStatusUseCase;->a:Landroid/content/Context;

    .line 28
    return-void
.end method


# virtual methods
.method protected a(Lcom/huawei/hwid/usecase/GetAccountStatusUseCase$RequestValues;)V
    .locals 13

    .line 32
    const-string v0, "GetAccountStatusUseCase"

    const-string v1, "GetAccountStatusUseCase"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 35
    iget-object v0, p0, Lcom/huawei/hwid/usecase/GetAccountStatusUseCase;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v7

    .line 37
    const-string v0, "content://com.huawei.hwid.api.provider/hwid_account_status"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v8

    .line 38
    const/4 v9, 0x0

    .line 40
    const/4 v10, 0x0

    .line 42
    move-object v0, v7

    move-object v1, v8

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :try_start_0
    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v9, v0

    .line 43
    const/4 v0, 0x0

    if-eq v0, v9, :cond_0

    invoke-interface {v9}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 45
    const-string v0, "accountstatus"

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v10, v0

    .line 51
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v9, :cond_2

    .line 53
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    goto :goto_0

    .line 48
    :catch_0
    move-exception v11

    .line 49
    const-string v0, "GetAccountStatusUseCase"

    const-string v1, "Exception"

    :try_start_1
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    const/4 v0, 0x0

    if-eq v0, v9, :cond_2

    .line 53
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    goto :goto_0

    .line 51
    :catchall_0
    move-exception v12

    const/4 v0, 0x0

    if-eq v0, v9, :cond_1

    .line 53
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    :cond_1
    throw v12

    .line 58
    :cond_2
    :goto_0
    const-string v0, "accountstatus"

    invoke-virtual {v6, v0, v10}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    invoke-virtual {p0}, Lcom/huawei/hwid/usecase/GetAccountStatusUseCase;->b()Lcom/huawei/hwid/UseCase$a;

    move-result-object v0

    invoke-interface {v0, v6}, Lcom/huawei/hwid/UseCase$a;->a(Landroid/os/Bundle;)V

    .line 60
    return-void
.end method

.method public synthetic b(Lcom/huawei/hwid/UseCase$RequestValues;)V
    .locals 1

    .line 18
    move-object v0, p1

    check-cast v0, Lcom/huawei/hwid/usecase/GetAccountStatusUseCase$RequestValues;

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/usecase/GetAccountStatusUseCase;->a(Lcom/huawei/hwid/usecase/GetAccountStatusUseCase$RequestValues;)V

    return-void
.end method
