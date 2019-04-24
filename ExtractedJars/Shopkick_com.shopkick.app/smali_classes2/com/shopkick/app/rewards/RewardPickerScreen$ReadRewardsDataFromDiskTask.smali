.class Lcom/shopkick/app/rewards/RewardPickerScreen$ReadRewardsDataFromDiskTask;
.super Landroid/os/AsyncTask;
.source "RewardPickerScreen.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/rewards/RewardPickerScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ReadRewardsDataFromDiskTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Object;",
        "Ljava/lang/Void;",
        "Ljava/util/ArrayList<",
        "Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;",
        ">;>;"
    }
.end annotation


# instance fields
.field private country:I

.field private resources:Landroid/content/res/Resources;

.field private screenWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/rewards/RewardPickerScreen;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;Lcom/shopkick/app/rewards/RewardPickerScreen;I)V
    .locals 0

    .line 271
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 272
    iput-object p1, p0, Lcom/shopkick/app/rewards/RewardPickerScreen$ReadRewardsDataFromDiskTask;->resources:Landroid/content/res/Resources;

    .line 273
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/rewards/RewardPickerScreen$ReadRewardsDataFromDiskTask;->screenWeakReference:Ljava/lang/ref/WeakReference;

    .line 274
    iput p3, p0, Lcom/shopkick/app/rewards/RewardPickerScreen$ReadRewardsDataFromDiskTask;->country:I

    return-void
.end method


# virtual methods
.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 265
    invoke-virtual {p0, p1}, Lcom/shopkick/app/rewards/RewardPickerScreen$ReadRewardsDataFromDiskTask;->doInBackground([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method protected doInBackground([Ljava/lang/Object;)Ljava/util/ArrayList;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;",
            ">;"
        }
    .end annotation

    .line 279
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 280
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 283
    :try_start_0
    iget v1, p0, Lcom/shopkick/app/rewards/RewardPickerScreen$ReadRewardsDataFromDiskTask;->country:I

    const/16 v2, 0x3a

    if-ne v1, v2, :cond_0

    .line 284
    iget-object v1, p0, Lcom/shopkick/app/rewards/RewardPickerScreen$ReadRewardsDataFromDiskTask;->resources:Landroid/content/res/Resources;

    const v2, 0x7f100008

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v1

    goto :goto_0

    .line 286
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/rewards/RewardPickerScreen$ReadRewardsDataFromDiskTask;->resources:Landroid/content/res/Resources;

    const v2, 0x7f100007

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v1

    .line 288
    :goto_0
    new-instance v2, Ljava/io/BufferedReader;

    new-instance v3, Ljava/io/InputStreamReader;

    invoke-direct {v3, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v2, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 290
    :goto_1
    invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 291
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 293
    :cond_1
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 294
    sget-object v1, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-class v2, Lcom/google/gson/JsonElement;

    invoke-virtual {v1, v0, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/gson/JsonArray;

    const/4 v1, 0x0

    .line 295
    :goto_2
    invoke-virtual {v0}, Lcom/google/gson/JsonArray;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 296
    invoke-virtual {v0, v1}, Lcom/google/gson/JsonArray;->get(I)Lcom/google/gson/JsonElement;

    move-result-object v2

    check-cast v2, Lcom/google/gson/JsonObject;

    .line 297
    sget-object v3, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v4, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    invoke-virtual {v3, v2, v4}, Lcom/google/gson/Gson;->fromJson(Lcom/google/gson/JsonElement;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    .line 298
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_2
    return-object p1

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 265
    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/rewards/RewardPickerScreen$ReadRewardsDataFromDiskTask;->onPostExecute(Ljava/util/ArrayList;)V

    return-void
.end method

.method protected onPostExecute(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;",
            ">;)V"
        }
    .end annotation

    .line 308
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardPickerScreen$ReadRewardsDataFromDiskTask;->screenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/rewards/RewardPickerScreen;

    if-eqz v0, :cond_0

    .line 310
    invoke-static {v0, p1}, Lcom/shopkick/app/rewards/RewardPickerScreen;->access$102(Lcom/shopkick/app/rewards/RewardPickerScreen;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 311
    invoke-static {v0}, Lcom/shopkick/app/rewards/RewardPickerScreen;->access$200(Lcom/shopkick/app/rewards/RewardPickerScreen;)V

    :cond_0
    return-void
.end method
