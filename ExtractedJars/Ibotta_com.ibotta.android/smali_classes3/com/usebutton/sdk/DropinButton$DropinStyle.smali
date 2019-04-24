.class Lcom/usebutton/sdk/DropinButton$DropinStyle;
.super Lcom/usebutton/sdk/internal/views/BaseButton$Style;
.source "DropinButton.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/DropinButton;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "DropinStyle"
.end annotation


# instance fields
.field private gravity:Ljava/lang/Integer;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private interactionDisabled:Z

.field private padding:Ljava/lang/Integer;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private paddingBottom:Ljava/lang/Integer;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private paddingLeft:Ljava/lang/Integer;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private paddingRight:Ljava/lang/Integer;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private paddingTop:Ljava/lang/Integer;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private textColorStates:Landroid/content/res/ColorStateList;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private textStyling:I


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 103
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/views/BaseButton$Style;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/usebutton/sdk/DropinButton$1;)V
    .locals 0

    .line 103
    invoke-direct {p0}, Lcom/usebutton/sdk/DropinButton$DropinStyle;-><init>()V

    return-void
.end method

.method static synthetic access$100(Lcom/usebutton/sdk/DropinButton$DropinStyle;)Landroid/content/res/ColorStateList;
    .locals 0

    .line 103
    iget-object p0, p0, Lcom/usebutton/sdk/DropinButton$DropinStyle;->textColorStates:Landroid/content/res/ColorStateList;

    return-object p0
.end method

.method static synthetic access$102(Lcom/usebutton/sdk/DropinButton$DropinStyle;Landroid/content/res/ColorStateList;)Landroid/content/res/ColorStateList;
    .locals 0

    .line 103
    iput-object p1, p0, Lcom/usebutton/sdk/DropinButton$DropinStyle;->textColorStates:Landroid/content/res/ColorStateList;

    return-object p1
.end method

.method static synthetic access$200(Lcom/usebutton/sdk/DropinButton$DropinStyle;)Ljava/lang/Integer;
    .locals 0

    .line 103
    iget-object p0, p0, Lcom/usebutton/sdk/DropinButton$DropinStyle;->padding:Ljava/lang/Integer;

    return-object p0
.end method

.method static synthetic access$202(Lcom/usebutton/sdk/DropinButton$DropinStyle;Ljava/lang/Integer;)Ljava/lang/Integer;
    .locals 0

    .line 103
    iput-object p1, p0, Lcom/usebutton/sdk/DropinButton$DropinStyle;->padding:Ljava/lang/Integer;

    return-object p1
.end method

.method static synthetic access$300(Lcom/usebutton/sdk/DropinButton$DropinStyle;)Ljava/lang/Integer;
    .locals 0

    .line 103
    iget-object p0, p0, Lcom/usebutton/sdk/DropinButton$DropinStyle;->paddingLeft:Ljava/lang/Integer;

    return-object p0
.end method

.method static synthetic access$302(Lcom/usebutton/sdk/DropinButton$DropinStyle;Ljava/lang/Integer;)Ljava/lang/Integer;
    .locals 0

    .line 103
    iput-object p1, p0, Lcom/usebutton/sdk/DropinButton$DropinStyle;->paddingLeft:Ljava/lang/Integer;

    return-object p1
.end method

.method static synthetic access$400(Lcom/usebutton/sdk/DropinButton$DropinStyle;)Ljava/lang/Integer;
    .locals 0

    .line 103
    iget-object p0, p0, Lcom/usebutton/sdk/DropinButton$DropinStyle;->paddingTop:Ljava/lang/Integer;

    return-object p0
.end method

.method static synthetic access$402(Lcom/usebutton/sdk/DropinButton$DropinStyle;Ljava/lang/Integer;)Ljava/lang/Integer;
    .locals 0

    .line 103
    iput-object p1, p0, Lcom/usebutton/sdk/DropinButton$DropinStyle;->paddingTop:Ljava/lang/Integer;

    return-object p1
.end method

.method static synthetic access$500(Lcom/usebutton/sdk/DropinButton$DropinStyle;)Ljava/lang/Integer;
    .locals 0

    .line 103
    iget-object p0, p0, Lcom/usebutton/sdk/DropinButton$DropinStyle;->paddingRight:Ljava/lang/Integer;

    return-object p0
.end method

.method static synthetic access$502(Lcom/usebutton/sdk/DropinButton$DropinStyle;Ljava/lang/Integer;)Ljava/lang/Integer;
    .locals 0

    .line 103
    iput-object p1, p0, Lcom/usebutton/sdk/DropinButton$DropinStyle;->paddingRight:Ljava/lang/Integer;

    return-object p1
.end method

.method static synthetic access$600(Lcom/usebutton/sdk/DropinButton$DropinStyle;)Ljava/lang/Integer;
    .locals 0

    .line 103
    iget-object p0, p0, Lcom/usebutton/sdk/DropinButton$DropinStyle;->paddingBottom:Ljava/lang/Integer;

    return-object p0
.end method

.method static synthetic access$602(Lcom/usebutton/sdk/DropinButton$DropinStyle;Ljava/lang/Integer;)Ljava/lang/Integer;
    .locals 0

    .line 103
    iput-object p1, p0, Lcom/usebutton/sdk/DropinButton$DropinStyle;->paddingBottom:Ljava/lang/Integer;

    return-object p1
.end method

.method static synthetic access$700(Lcom/usebutton/sdk/DropinButton$DropinStyle;)Ljava/lang/Integer;
    .locals 0

    .line 103
    iget-object p0, p0, Lcom/usebutton/sdk/DropinButton$DropinStyle;->gravity:Ljava/lang/Integer;

    return-object p0
.end method

.method static synthetic access$702(Lcom/usebutton/sdk/DropinButton$DropinStyle;Ljava/lang/Integer;)Ljava/lang/Integer;
    .locals 0

    .line 103
    iput-object p1, p0, Lcom/usebutton/sdk/DropinButton$DropinStyle;->gravity:Ljava/lang/Integer;

    return-object p1
.end method

.method static synthetic access$800(Lcom/usebutton/sdk/DropinButton$DropinStyle;)I
    .locals 0

    .line 103
    iget p0, p0, Lcom/usebutton/sdk/DropinButton$DropinStyle;->textStyling:I

    return p0
.end method

.method static synthetic access$802(Lcom/usebutton/sdk/DropinButton$DropinStyle;I)I
    .locals 0

    .line 103
    iput p1, p0, Lcom/usebutton/sdk/DropinButton$DropinStyle;->textStyling:I

    return p1
.end method

.method static synthetic access$900(Lcom/usebutton/sdk/DropinButton$DropinStyle;)Z
    .locals 0

    .line 103
    iget-boolean p0, p0, Lcom/usebutton/sdk/DropinButton$DropinStyle;->interactionDisabled:Z

    return p0
.end method

.method static synthetic access$902(Lcom/usebutton/sdk/DropinButton$DropinStyle;Z)Z
    .locals 0

    .line 103
    iput-boolean p1, p0, Lcom/usebutton/sdk/DropinButton$DropinStyle;->interactionDisabled:Z

    return p1
.end method
