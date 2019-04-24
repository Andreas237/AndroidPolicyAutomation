.class public Lcom/huawei/wallet/storage/db/Operator;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected c:Landroid/database/sqlite/SQLiteDatabase;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    invoke-static {}, Lcom/huawei/wallet/storage/db/WalletDBManager;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/wallet/storage/db/Operator;->c:Landroid/database/sqlite/SQLiteDatabase;

    .line 36
    return-void
.end method
