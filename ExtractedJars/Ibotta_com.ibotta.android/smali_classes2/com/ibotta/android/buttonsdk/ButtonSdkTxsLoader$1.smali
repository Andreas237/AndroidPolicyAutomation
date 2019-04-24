.class Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader$1;
.super Ljava/lang/Object;
.source "ButtonSdkTxsLoader.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;->createGiveUpRunnable(Lcom/ibotta/android/service/api/job/SingleApiJob;)Ljava/lang/Runnable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;

.field final synthetic val$apiJob:Lcom/ibotta/android/service/api/job/SingleApiJob;


# direct methods
.method constructor <init>(Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 0

    .line 101
    iput-object p1, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader$1;->this$0:Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;

    iput-object p2, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader$1;->val$apiJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 104
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader$1;->this$0:Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;

    iget-object v1, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader$1;->val$apiJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;->onGiveUp(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    return-void
.end method
