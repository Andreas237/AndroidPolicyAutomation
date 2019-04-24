.class Lcom/shopkick/app/registration/VerifyPhoneScreen$2;
.super Ljava/lang/Object;
.source "VerifyPhoneScreen.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


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

    .line 250
    iput-object p1, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen$2;->this$0:Lcom/shopkick/app/registration/VerifyPhoneScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 253
    iget-object p1, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen$2;->this$0:Lcom/shopkick/app/registration/VerifyPhoneScreen;

    iget-object p1, p1, Lcom/shopkick/app/registration/VerifyPhoneScreen;->callMeDialog:Landroid/app/AlertDialog;

    invoke-virtual {p1}, Landroid/app/AlertDialog;->dismiss()V

    return-void
.end method
