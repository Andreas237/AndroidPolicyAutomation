.class Lcom/shopkick/app/gcm/GCMDataSource$1;
.super Ljava/lang/Object;
.source "GCMDataSource.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/gcm/GCMDataSource;->completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/gcm/GCMDataSource;

.field final synthetic val$registering:Z

.field final synthetic val$registrationId:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/shopkick/app/gcm/GCMDataSource;ZLjava/lang/String;)V
    .locals 0

    .line 141
    iput-object p1, p0, Lcom/shopkick/app/gcm/GCMDataSource$1;->this$0:Lcom/shopkick/app/gcm/GCMDataSource;

    iput-boolean p2, p0, Lcom/shopkick/app/gcm/GCMDataSource$1;->val$registering:Z

    iput-object p3, p0, Lcom/shopkick/app/gcm/GCMDataSource$1;->val$registrationId:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 144
    iget-boolean v0, p0, Lcom/shopkick/app/gcm/GCMDataSource$1;->val$registering:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 145
    iget-object v0, p0, Lcom/shopkick/app/gcm/GCMDataSource$1;->this$0:Lcom/shopkick/app/gcm/GCMDataSource;

    invoke-static {v0, v1}, Lcom/shopkick/app/gcm/GCMDataSource;->access$002(Lcom/shopkick/app/gcm/GCMDataSource;Lcom/shopkick/app/fetchers/api/IAPIObject;)Lcom/shopkick/app/fetchers/api/IAPIObject;

    .line 146
    iget-object v0, p0, Lcom/shopkick/app/gcm/GCMDataSource$1;->this$0:Lcom/shopkick/app/gcm/GCMDataSource;

    invoke-static {v0}, Lcom/shopkick/app/gcm/GCMDataSource;->access$100(Lcom/shopkick/app/gcm/GCMDataSource;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/gcm/GCMDataSource$1;->val$registrationId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/gcm/GCMDataSource;->register(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 148
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/gcm/GCMDataSource$1;->this$0:Lcom/shopkick/app/gcm/GCMDataSource;

    invoke-static {v0, v1}, Lcom/shopkick/app/gcm/GCMDataSource;->access$002(Lcom/shopkick/app/gcm/GCMDataSource;Lcom/shopkick/app/fetchers/api/IAPIObject;)Lcom/shopkick/app/fetchers/api/IAPIObject;

    .line 149
    iget-object v0, p0, Lcom/shopkick/app/gcm/GCMDataSource$1;->this$0:Lcom/shopkick/app/gcm/GCMDataSource;

    invoke-static {v0}, Lcom/shopkick/app/gcm/GCMDataSource;->access$100(Lcom/shopkick/app/gcm/GCMDataSource;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/gcm/GCMDataSource$1;->val$registrationId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/gcm/GCMDataSource;->unregister(Landroid/content/Context;Ljava/lang/String;)V

    :goto_0
    return-void
.end method
