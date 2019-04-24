.class public Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;
.super Ljava/lang/Object;
.source "ButtonSdkStorage.java"


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation


# static fields
.field private static final KEY_LAUNCH_TIMESTAMP:Ljava/lang/String; = "launch_timestamp"

.field private static final KEY_PENDING_ACTIVITY_MESSAGE:Ljava/lang/String; = "pending_activity_message"

.field private static final KEY_RETAILER_ICON_URL:Ljava/lang/String; = "retailer_icon_url"

.field private static final KEY_RETAILER_ID:Ljava/lang/String; = "retailer_id"

.field private static final KEY_RETAILER_NAME:Ljava/lang/String; = "retailer_name"

.field private static final KEY_RETURNING_USER_MESSAGE:Ljava/lang/String; = "returning_user_message"

.field private static final KEY_SRC_TOKEN:Ljava/lang/String; = "src_token"

.field public static final PREFS_NAME:Ljava/lang/String; = "button_sdk_manager"


# instance fields
.field private final prefs:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>(Landroid/content/SharedPreferences;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;->prefs:Landroid/content/SharedPreferences;

    return-void
.end method


# virtual methods
.method public deleteEverything()V
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 53
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 54
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-void
.end method

.method public getLaunchTimestamp()Ljava/lang/Long;
    .locals 4

    .line 86
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "launch_timestamp"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 87
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "launch_timestamp"

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getPendingActivityMessage()Ljava/lang/String;
    .locals 3

    .line 80
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "pending_activity_message"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getRetailerIconUrl()Ljava/lang/String;
    .locals 3

    .line 72
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "retailer_icon_url"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getRetailerId()Ljava/lang/Integer;
    .locals 3

    .line 60
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "retailer_id"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 61
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "retailer_id"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getRetailerName()Ljava/lang/String;
    .locals 3

    .line 68
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "retailer_name"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getReturningUserMessage()Ljava/lang/String;
    .locals 3

    .line 76
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "returning_user_message"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getSharedPreferences()Landroid/content/SharedPreferences;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;->prefs:Landroid/content/SharedPreferences;

    return-object v0
.end method

.method public getSrcToken()Ljava/lang/String;
    .locals 3
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 97
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "src_token"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 98
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;->prefs:Landroid/content/SharedPreferences;

    const-string v2, "src_token"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :cond_0
    return-object v1
.end method

.method public isReturningFromLaunch()Z
    .locals 1

    .line 105
    invoke-virtual {p0}, Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;->getRetailerId()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;->getRetailerName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;->getLaunchTimestamp()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 106
    invoke-virtual {p0}, Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;->getSrcToken()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public saveLaunchData(Lcom/ibotta/android/fragment/retailer/RetailerParcel;JLjava/lang/String;)V
    .locals 3

    .line 35
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "retailer_id"

    .line 36
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    const-string v1, "retailer_name"

    .line 37
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    const-string v1, "retailer_icon_url"

    .line 38
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getIconUrl()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 40
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getRedemptionMeta()Lcom/ibotta/api/model/retailer/RedemptionMeta;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string v1, "returning_user_message"

    .line 42
    invoke-virtual {p1}, Lcom/ibotta/api/model/retailer/RedemptionMeta;->getButtonReturningUserMessage()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    const-string v1, "pending_activity_message"

    .line 43
    invoke-virtual {p1}, Lcom/ibotta/api/model/retailer/RedemptionMeta;->getButtonPendingActivityMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    :cond_0
    const-string p1, "launch_timestamp"

    .line 46
    invoke-interface {v0, p1, p2, p3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    const-string p1, "src_token"

    .line 47
    invoke-interface {v0, p1, p4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 48
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-void
.end method
