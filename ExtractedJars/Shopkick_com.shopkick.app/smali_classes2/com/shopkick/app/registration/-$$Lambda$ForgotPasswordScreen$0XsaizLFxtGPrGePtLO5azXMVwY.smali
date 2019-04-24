.class public final synthetic Lcom/shopkick/app/registration/-$$Lambda$ForgotPasswordScreen$0XsaizLFxtGPrGePtLO5azXMVwY;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;


# instance fields
.field private final synthetic f$0:Lcom/shopkick/app/registration/ForgotPasswordScreen;

.field private final synthetic f$1:Lcom/shopkick/app/fetchers/api/skapi/UserResetPasswordResponse;


# direct methods
.method public synthetic constructor <init>(Lcom/shopkick/app/registration/ForgotPasswordScreen;Lcom/shopkick/app/fetchers/api/skapi/UserResetPasswordResponse;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/registration/-$$Lambda$ForgotPasswordScreen$0XsaizLFxtGPrGePtLO5azXMVwY;->f$0:Lcom/shopkick/app/registration/ForgotPasswordScreen;

    iput-object p2, p0, Lcom/shopkick/app/registration/-$$Lambda$ForgotPasswordScreen$0XsaizLFxtGPrGePtLO5azXMVwY;->f$1:Lcom/shopkick/app/fetchers/api/skapi/UserResetPasswordResponse;

    return-void
.end method


# virtual methods
.method public final onBtnClickListener(Ljava/lang/ref/WeakReference;)V
    .locals 2

    iget-object v0, p0, Lcom/shopkick/app/registration/-$$Lambda$ForgotPasswordScreen$0XsaizLFxtGPrGePtLO5azXMVwY;->f$0:Lcom/shopkick/app/registration/ForgotPasswordScreen;

    iget-object v1, p0, Lcom/shopkick/app/registration/-$$Lambda$ForgotPasswordScreen$0XsaizLFxtGPrGePtLO5azXMVwY;->f$1:Lcom/shopkick/app/fetchers/api/skapi/UserResetPasswordResponse;

    invoke-static {v0, v1, p1}, Lcom/shopkick/app/registration/ForgotPasswordScreen;->lambda$completedResponse$215(Lcom/shopkick/app/registration/ForgotPasswordScreen;Lcom/shopkick/app/fetchers/api/skapi/UserResetPasswordResponse;Ljava/lang/ref/WeakReference;)V

    return-void
.end method
