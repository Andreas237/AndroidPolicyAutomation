.class Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$ResetEmailViewHolder;
.super Lcom/ibotta/android/fragment/dialog/flyup/FlyUpViewHolder;
.source "UnconfirmedFlyUpPageCreator.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ResetEmailViewHolder"
.end annotation


# instance fields
.field private bResetEmail:Landroid/widget/Button;

.field private etEmail:Landroid/widget/EditText;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 165
    invoke-direct {p0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpViewHolder;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$1;)V
    .locals 0

    .line 165
    invoke-direct {p0}, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$ResetEmailViewHolder;-><init>()V

    return-void
.end method

.method static synthetic access$500(Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$ResetEmailViewHolder;)Landroid/widget/EditText;
    .locals 0

    .line 165
    iget-object p0, p0, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$ResetEmailViewHolder;->etEmail:Landroid/widget/EditText;

    return-object p0
.end method

.method static synthetic access$502(Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$ResetEmailViewHolder;Landroid/widget/EditText;)Landroid/widget/EditText;
    .locals 0

    .line 165
    iput-object p1, p0, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$ResetEmailViewHolder;->etEmail:Landroid/widget/EditText;

    return-object p1
.end method

.method static synthetic access$600(Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$ResetEmailViewHolder;)Landroid/widget/Button;
    .locals 0

    .line 165
    iget-object p0, p0, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$ResetEmailViewHolder;->bResetEmail:Landroid/widget/Button;

    return-object p0
.end method

.method static synthetic access$602(Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$ResetEmailViewHolder;Landroid/widget/Button;)Landroid/widget/Button;
    .locals 0

    .line 165
    iput-object p1, p0, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$ResetEmailViewHolder;->bResetEmail:Landroid/widget/Button;

    return-object p1
.end method
