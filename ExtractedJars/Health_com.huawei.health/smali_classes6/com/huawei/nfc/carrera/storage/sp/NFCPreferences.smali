.class public final Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final HOTALK_PROPERTIES_NAME:Ljava/lang/String; = "NFC_Properties"

.field private static final SYNC_LOCK:[B

.field private static instance:Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences; = null


# instance fields
.field private sp:Landroid/content/SharedPreferences;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 29
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->instance:Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;

    .line 34
    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->SYNC_LOCK:[B

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->sp:Landroid/content/SharedPreferences;

    .line 40
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "NFC_Properties"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->sp:Landroid/content/SharedPreferences;

    .line 41
    return-void
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;
    .locals 4

    .line 50
    sget-object v2, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->SYNC_LOCK:[B

    monitor-enter v2

    .line 51
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->instance:Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 52
    new-instance v0, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->instance:Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;

    .line 54
    :cond_0
    sget-object v0, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->instance:Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 55
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method


# virtual methods
.method public getBoolean(Ljava/lang/String;Z)Z
    .locals 1

    .line 141
    iget-object v0, p0, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->sp:Landroid/content/SharedPreferences;

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public getInt(Ljava/lang/String;I)I
    .locals 1

    .line 167
    iget-object v0, p0, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->sp:Landroid/content/SharedPreferences;

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public getLong(Ljava/lang/String;Ljava/lang/Long;)Ljava/lang/Long;
    .locals 3

    .line 91
    iget-object v0, p0, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->sp:Landroid/content/SharedPreferences;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-interface {v0, p1, v1, v2}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 116
    iget-object v0, p0, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->sp:Landroid/content/SharedPreferences;

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public putBoolean(Ljava/lang/String;Z)Z
    .locals 1

    .line 128
    iget-object v0, p0, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->sp:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v0

    return v0
.end method

.method public putInt(Ljava/lang/String;I)Z
    .locals 1

    .line 154
    iget-object v0, p0, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->sp:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v0

    return v0
.end method

.method public putLong(Ljava/lang/String;Ljava/lang/Long;)Z
    .locals 3

    .line 78
    iget-object v0, p0, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->sp:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-interface {v0, p1, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v0

    return v0
.end method

.method public putString(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->sp:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v0

    return v0
.end method

.method public remove(Ljava/lang/String;)Z
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->sp:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v0

    return v0
.end method
