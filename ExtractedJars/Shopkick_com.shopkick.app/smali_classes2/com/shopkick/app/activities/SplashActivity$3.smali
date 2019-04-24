.class Lcom/shopkick/app/activities/SplashActivity$3;
.super Ljava/lang/Object;
.source "SplashActivity.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/activities/SplashActivity;->showErrorAlert(Ljava/lang/String;)V
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

    .line 452
    iput-object p1, p0, Lcom/shopkick/app/activities/SplashActivity$3;->this$0:Lcom/shopkick/app/activities/SplashActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 454
    invoke-interface {p1}, Landroid/content/DialogInterface;->cancel()V

    .line 455
    iget-object p1, p0, Lcom/shopkick/app/activities/SplashActivity$3;->this$0:Lcom/shopkick/app/activities/SplashActivity;

    invoke-static {p1}, Lcom/shopkick/app/activities/SplashActivity;->access$300(Lcom/shopkick/app/activities/SplashActivity;)V

    return-void
.end method
