.class Lcom/shopkick/app/registration/SelectCountryController$CountryCheckboxClick;
.super Ljava/lang/Object;
.source "SelectCountryController.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/registration/SelectCountryController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "CountryCheckboxClick"
.end annotation


# instance fields
.field private controllerRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/registration/SelectCountryController;",
            ">;"
        }
    .end annotation
.end field

.field private countryCode:I


# direct methods
.method public constructor <init>(Lcom/shopkick/app/registration/SelectCountryController;I)V
    .locals 1

    .line 113
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 114
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/registration/SelectCountryController$CountryCheckboxClick;->controllerRef:Ljava/lang/ref/WeakReference;

    .line 115
    iput p2, p0, Lcom/shopkick/app/registration/SelectCountryController$CountryCheckboxClick;->countryCode:I

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 120
    iget-object p1, p0, Lcom/shopkick/app/registration/SelectCountryController$CountryCheckboxClick;->controllerRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/registration/SelectCountryController;

    if-eqz p1, :cond_0

    .line 122
    iget v0, p0, Lcom/shopkick/app/registration/SelectCountryController$CountryCheckboxClick;->countryCode:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/shopkick/app/registration/SelectCountryController;->access$000(Lcom/shopkick/app/registration/SelectCountryController;Ljava/lang/Integer;)V

    :cond_0
    return-void
.end method
