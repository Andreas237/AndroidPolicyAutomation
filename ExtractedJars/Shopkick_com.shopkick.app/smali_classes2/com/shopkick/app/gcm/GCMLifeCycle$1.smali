.class Lcom/shopkick/app/gcm/GCMLifeCycle$1;
.super Ljava/lang/Object;
.source "GCMLifeCycle.java"

# interfaces
.implements Lcom/google/android/gms/tasks/OnSuccessListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/gcm/GCMLifeCycle;->register()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/tasks/OnSuccessListener<",
        "Lcom/google/firebase/iid/InstanceIdResult;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/gcm/GCMLifeCycle;


# direct methods
.method constructor <init>(Lcom/shopkick/app/gcm/GCMLifeCycle;)V
    .locals 0

    .line 72
    iput-object p1, p0, Lcom/shopkick/app/gcm/GCMLifeCycle$1;->this$0:Lcom/shopkick/app/gcm/GCMLifeCycle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSuccess(Lcom/google/firebase/iid/InstanceIdResult;)V
    .locals 2

    .line 77
    iget-object v0, p0, Lcom/shopkick/app/gcm/GCMLifeCycle$1;->this$0:Lcom/shopkick/app/gcm/GCMLifeCycle;

    invoke-interface {p1}, Lcom/google/firebase/iid/InstanceIdResult;->getToken()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/gcm/GCMLifeCycle;->regId:Ljava/lang/String;

    .line 78
    iget-object p1, p0, Lcom/shopkick/app/gcm/GCMLifeCycle$1;->this$0:Lcom/shopkick/app/gcm/GCMLifeCycle;

    invoke-static {p1}, Lcom/shopkick/app/gcm/GCMLifeCycle;->access$100(Lcom/shopkick/app/gcm/GCMLifeCycle;)Lcom/shopkick/app/gcm/GCMDataSource;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/gcm/GCMLifeCycle$1;->this$0:Lcom/shopkick/app/gcm/GCMLifeCycle;

    invoke-static {v0}, Lcom/shopkick/app/gcm/GCMLifeCycle;->access$000(Lcom/shopkick/app/gcm/GCMLifeCycle;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/gcm/GCMLifeCycle$1;->this$0:Lcom/shopkick/app/gcm/GCMLifeCycle;

    iget-object v1, v1, Lcom/shopkick/app/gcm/GCMLifeCycle;->regId:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/gcm/GCMDataSource;->register(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 72
    check-cast p1, Lcom/google/firebase/iid/InstanceIdResult;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/gcm/GCMLifeCycle$1;->onSuccess(Lcom/google/firebase/iid/InstanceIdResult;)V

    return-void
.end method
