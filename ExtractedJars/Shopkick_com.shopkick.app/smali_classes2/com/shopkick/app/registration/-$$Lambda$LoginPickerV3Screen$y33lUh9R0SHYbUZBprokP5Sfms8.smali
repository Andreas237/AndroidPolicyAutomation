.class public final synthetic Lcom/shopkick/app/registration/-$$Lambda$LoginPickerV3Screen$y33lUh9R0SHYbUZBprokP5Sfms8;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;


# instance fields
.field private final synthetic f$0:Lcom/shopkick/app/registration/LoginPickerV3Screen;

.field private final synthetic f$1:Lcom/shopkick/app/account/Authenticator$AuthAction;

.field private final synthetic f$2:Lcom/shopkick/app/account/Authenticator$AuthMedium;


# direct methods
.method public synthetic constructor <init>(Lcom/shopkick/app/registration/LoginPickerV3Screen;Lcom/shopkick/app/account/Authenticator$AuthAction;Lcom/shopkick/app/account/Authenticator$AuthMedium;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/registration/-$$Lambda$LoginPickerV3Screen$y33lUh9R0SHYbUZBprokP5Sfms8;->f$0:Lcom/shopkick/app/registration/LoginPickerV3Screen;

    iput-object p2, p0, Lcom/shopkick/app/registration/-$$Lambda$LoginPickerV3Screen$y33lUh9R0SHYbUZBprokP5Sfms8;->f$1:Lcom/shopkick/app/account/Authenticator$AuthAction;

    iput-object p3, p0, Lcom/shopkick/app/registration/-$$Lambda$LoginPickerV3Screen$y33lUh9R0SHYbUZBprokP5Sfms8;->f$2:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    return-void
.end method


# virtual methods
.method public final onBtnClickListener(Ljava/lang/ref/WeakReference;)V
    .locals 3

    iget-object v0, p0, Lcom/shopkick/app/registration/-$$Lambda$LoginPickerV3Screen$y33lUh9R0SHYbUZBprokP5Sfms8;->f$0:Lcom/shopkick/app/registration/LoginPickerV3Screen;

    iget-object v1, p0, Lcom/shopkick/app/registration/-$$Lambda$LoginPickerV3Screen$y33lUh9R0SHYbUZBprokP5Sfms8;->f$1:Lcom/shopkick/app/account/Authenticator$AuthAction;

    iget-object v2, p0, Lcom/shopkick/app/registration/-$$Lambda$LoginPickerV3Screen$y33lUh9R0SHYbUZBprokP5Sfms8;->f$2:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    invoke-static {v0, v1, v2, p1}, Lcom/shopkick/app/registration/LoginPickerV3Screen;->lambda$handleCredentialRetrieveFailure$216(Lcom/shopkick/app/registration/LoginPickerV3Screen;Lcom/shopkick/app/account/Authenticator$AuthAction;Lcom/shopkick/app/account/Authenticator$AuthMedium;Ljava/lang/ref/WeakReference;)V

    return-void
.end method
