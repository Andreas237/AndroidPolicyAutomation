.class Lcom/shopkick/app/activities/SplashActivity$1;
.super Ljava/lang/Object;
.source "SplashActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/activities/SplashActivity;->handleOnStart()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/activities/SplashActivity;


# direct methods
.method constructor <init>(Lcom/shopkick/app/activities/SplashActivity;)V
    .locals 0

    .line 141
    iput-object p1, p0, Lcom/shopkick/app/activities/SplashActivity$1;->this$0:Lcom/shopkick/app/activities/SplashActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 145
    iget-object v0, p0, Lcom/shopkick/app/activities/SplashActivity$1;->this$0:Lcom/shopkick/app/activities/SplashActivity;

    invoke-static {v0}, Lcom/shopkick/app/activities/SplashActivity;->access$000(Lcom/shopkick/app/activities/SplashActivity;)Lcom/shopkick/app/activities/SplashActivity$PermissionInstructionAdapter;

    move-result-object v0

    invoke-static {v0}, Lcom/shopkick/app/activities/SplashActivity$PermissionInstructionAdapter;->access$100(Lcom/shopkick/app/activities/SplashActivity$PermissionInstructionAdapter;)V

    return-void
.end method
