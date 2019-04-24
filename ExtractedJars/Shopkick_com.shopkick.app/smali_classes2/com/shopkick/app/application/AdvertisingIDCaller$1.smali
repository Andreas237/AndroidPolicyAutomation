.class Lcom/shopkick/app/application/AdvertisingIDCaller$1;
.super Ljava/lang/Object;
.source "AdvertisingIDCaller.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/application/AdvertisingIDCaller;->getAdvertisingIdFuture()Ljava/util/concurrent/Future;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/application/AdvertisingIDCaller;


# direct methods
.method constructor <init>(Lcom/shopkick/app/application/AdvertisingIDCaller;)V
    .locals 0

    .line 110
    iput-object p1, p0, Lcom/shopkick/app/application/AdvertisingIDCaller$1;->this$0:Lcom/shopkick/app/application/AdvertisingIDCaller;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public call()Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;
    .locals 4

    .line 113
    iget-object v0, p0, Lcom/shopkick/app/application/AdvertisingIDCaller$1;->this$0:Lcom/shopkick/app/application/AdvertisingIDCaller;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AdvertisingIDCaller;->getAdvertisingInfoFromOS()Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 117
    invoke-virtual {v0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->getId()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 120
    :goto_0
    iget-object v2, p0, Lcom/shopkick/app/application/AdvertisingIDCaller$1;->this$0:Lcom/shopkick/app/application/AdvertisingIDCaller;

    invoke-static {v2}, Lcom/shopkick/app/application/AdvertisingIDCaller;->access$000(Lcom/shopkick/app/application/AdvertisingIDCaller;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 121
    iget-object v2, p0, Lcom/shopkick/app/application/AdvertisingIDCaller$1;->this$0:Lcom/shopkick/app/application/AdvertisingIDCaller;

    invoke-static {v2, v1}, Lcom/shopkick/app/application/AdvertisingIDCaller;->access$002(Lcom/shopkick/app/application/AdvertisingIDCaller;Ljava/lang/String;)Ljava/lang/String;

    .line 122
    iget-object v2, p0, Lcom/shopkick/app/application/AdvertisingIDCaller$1;->this$0:Lcom/shopkick/app/application/AdvertisingIDCaller;

    invoke-static {v2}, Lcom/shopkick/app/application/AdvertisingIDCaller;->access$100(Lcom/shopkick/app/application/AdvertisingIDCaller;)Landroid/content/SharedPreferences;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const-string v3, "advertising_id"

    .line 123
    invoke-interface {v2, v3, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 124
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_1
    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 110
    invoke-virtual {p0}, Lcom/shopkick/app/application/AdvertisingIDCaller$1;->call()Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

    move-result-object v0

    return-object v0
.end method
