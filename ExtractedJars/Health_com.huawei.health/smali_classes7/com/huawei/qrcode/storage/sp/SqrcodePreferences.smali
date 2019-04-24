.class public final Lcom/huawei/qrcode/storage/sp/SqrcodePreferences;
.super Ljava/lang/Object;


# static fields
.field private static final SQRCODE_SP_NAME:Ljava/lang/String; = "scanqrcodesp"

.field private static instance:Lcom/huawei/qrcode/storage/sp/SqrcodePreferences; = null


# instance fields
.field private sp:Landroid/content/SharedPreferences;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/qrcode/storage/sp/SqrcodePreferences;->instance:Lcom/huawei/qrcode/storage/sp/SqrcodePreferences;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/qrcode/storage/sp/SqrcodePreferences;->sp:Landroid/content/SharedPreferences;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "scanqrcodesp"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/qrcode/storage/sp/SqrcodePreferences;->sp:Landroid/content/SharedPreferences;

    return-void
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/huawei/qrcode/storage/sp/SqrcodePreferences;
    .locals 2

    sget-object v0, Lcom/huawei/qrcode/storage/sp/SqrcodePreferences;->instance:Lcom/huawei/qrcode/storage/sp/SqrcodePreferences;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    new-instance v0, Lcom/huawei/qrcode/storage/sp/SqrcodePreferences;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/huawei/qrcode/storage/sp/SqrcodePreferences;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/qrcode/storage/sp/SqrcodePreferences;->instance:Lcom/huawei/qrcode/storage/sp/SqrcodePreferences;

    :cond_0
    sget-object v0, Lcom/huawei/qrcode/storage/sp/SqrcodePreferences;->instance:Lcom/huawei/qrcode/storage/sp/SqrcodePreferences;

    return-object v0
.end method


# virtual methods
.method public getBoolean(Ljava/lang/String;Z)Z
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/storage/sp/SqrcodePreferences;->sp:Landroid/content/SharedPreferences;

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/storage/sp/SqrcodePreferences;->sp:Landroid/content/SharedPreferences;

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public putBoolean(Ljava/lang/String;Z)Z
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/storage/sp/SqrcodePreferences;->sp:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v0

    return v0
.end method

.method public putString(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/storage/sp/SqrcodePreferences;->sp:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-void
.end method

.method public removeKeyValue(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/storage/sp/SqrcodePreferences;->sp:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-void
.end method
