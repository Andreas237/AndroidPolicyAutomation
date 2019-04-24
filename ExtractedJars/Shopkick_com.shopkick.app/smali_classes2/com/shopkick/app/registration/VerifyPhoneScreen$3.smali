.class Lcom/shopkick/app/registration/VerifyPhoneScreen$3;
.super Ljava/lang/Object;
.source "VerifyPhoneScreen.java"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/registration/VerifyPhoneScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/registration/VerifyPhoneScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/registration/VerifyPhoneScreen;)V
    .locals 0

    .line 257
    iput-object p1, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen$3;->this$0:Lcom/shopkick/app/registration/VerifyPhoneScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    .line 260
    iget-object p1, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen$3;->this$0:Lcom/shopkick/app/registration/VerifyPhoneScreen;

    const/4 v0, 0x0

    iput-boolean v0, p1, Lcom/shopkick/app/registration/VerifyPhoneScreen;->buttonTapped:Z

    return-void
.end method
