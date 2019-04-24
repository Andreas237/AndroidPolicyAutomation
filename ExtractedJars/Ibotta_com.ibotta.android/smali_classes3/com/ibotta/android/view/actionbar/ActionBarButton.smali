.class public final enum Lcom/ibotta/android/view/actionbar/ActionBarButton;
.super Ljava/lang/Enum;
.source "ActionBarButton.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/view/actionbar/ActionBarButton;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/view/actionbar/ActionBarButton;

.field public static final enum BARCODE:Lcom/ibotta/android/view/actionbar/ActionBarButton;

.field public static final enum DONE:Lcom/ibotta/android/view/actionbar/ActionBarButton;

.field public static final enum EDIT:Lcom/ibotta/android/view/actionbar/ActionBarButton;

.field public static final enum FAVORITE_OFF:Lcom/ibotta/android/view/actionbar/ActionBarButton;

.field public static final enum FAVORITE_ON:Lcom/ibotta/android/view/actionbar/ActionBarButton;

.field public static final enum FLASH_OFF:Lcom/ibotta/android/view/actionbar/ActionBarButton;

.field public static final enum FLASH_ON:Lcom/ibotta/android/view/actionbar/ActionBarButton;

.field public static final enum HELP:Lcom/ibotta/android/view/actionbar/ActionBarButton;

.field public static final enum LOG_OUT:Lcom/ibotta/android/view/actionbar/ActionBarButton;

.field public static final enum MORE:Lcom/ibotta/android/view/actionbar/ActionBarButton;

.field public static final enum NOTIFICATION_COUNT:Lcom/ibotta/android/view/actionbar/ActionBarButton;

.field public static final enum REFRESH:Lcom/ibotta/android/view/actionbar/ActionBarButton;

.field public static final enum REPLAY:Lcom/ibotta/android/view/actionbar/ActionBarButton;

.field public static final enum RESEND_GIFT_CARD_EMAIL:Lcom/ibotta/android/view/actionbar/ActionBarButton;

.field public static final enum SAVE:Lcom/ibotta/android/view/actionbar/ActionBarButton;

.field public static final enum SHARE:Lcom/ibotta/android/view/actionbar/ActionBarButton;

.field public static final enum SHOPPING_LIST:Lcom/ibotta/android/view/actionbar/ActionBarButton;

.field public static final enum UNLOCKED_DEALS:Lcom/ibotta/android/view/actionbar/ActionBarButton;


# instance fields
.field private final id:I

.field private final image:I

.field private final title:I


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 18
    new-instance v6, Lcom/ibotta/android/view/actionbar/ActionBarButton;

    const-string v1, "BARCODE"

    const/4 v2, 0x0

    const v3, 0x7f09002e

    const v4, 0x7f080028

    const v5, 0x7f110039

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/view/actionbar/ActionBarButton;-><init>(Ljava/lang/String;IIII)V

    sput-object v6, Lcom/ibotta/android/view/actionbar/ActionBarButton;->BARCODE:Lcom/ibotta/android/view/actionbar/ActionBarButton;

    .line 19
    new-instance v0, Lcom/ibotta/android/view/actionbar/ActionBarButton;

    const-string v8, "DONE"

    const/4 v9, 0x1

    const v10, 0x7f090030

    const v11, 0x7f080204

    const v12, 0x7f11003a

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/ibotta/android/view/actionbar/ActionBarButton;-><init>(Ljava/lang/String;IIII)V

    sput-object v0, Lcom/ibotta/android/view/actionbar/ActionBarButton;->DONE:Lcom/ibotta/android/view/actionbar/ActionBarButton;

    .line 20
    new-instance v0, Lcom/ibotta/android/view/actionbar/ActionBarButton;

    const-string v2, "HELP"

    const/4 v3, 0x2

    const v4, 0x7f090034

    const v5, 0x7f080265

    const v6, 0x7f11003e

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/ibotta/android/view/actionbar/ActionBarButton;-><init>(Ljava/lang/String;IIII)V

    sput-object v0, Lcom/ibotta/android/view/actionbar/ActionBarButton;->HELP:Lcom/ibotta/android/view/actionbar/ActionBarButton;

    .line 21
    new-instance v0, Lcom/ibotta/android/view/actionbar/ActionBarButton;

    const-string v8, "LOG_OUT"

    const/4 v9, 0x3

    const v10, 0x7f090035

    const/4 v11, -0x1

    const v12, 0x7f11003f

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/ibotta/android/view/actionbar/ActionBarButton;-><init>(Ljava/lang/String;IIII)V

    sput-object v0, Lcom/ibotta/android/view/actionbar/ActionBarButton;->LOG_OUT:Lcom/ibotta/android/view/actionbar/ActionBarButton;

    .line 22
    new-instance v0, Lcom/ibotta/android/view/actionbar/ActionBarButton;

    const-string v2, "REFRESH"

    const/4 v3, 0x4

    const v4, 0x7f090038

    const v5, 0x7f080038

    const v6, 0x7f110042

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/ibotta/android/view/actionbar/ActionBarButton;-><init>(Ljava/lang/String;IIII)V

    sput-object v0, Lcom/ibotta/android/view/actionbar/ActionBarButton;->REFRESH:Lcom/ibotta/android/view/actionbar/ActionBarButton;

    .line 23
    new-instance v0, Lcom/ibotta/android/view/actionbar/ActionBarButton;

    const-string v8, "REPLAY"

    const/4 v9, 0x5

    const v10, 0x7f090039

    const v12, 0x7f110043

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/ibotta/android/view/actionbar/ActionBarButton;-><init>(Ljava/lang/String;IIII)V

    sput-object v0, Lcom/ibotta/android/view/actionbar/ActionBarButton;->REPLAY:Lcom/ibotta/android/view/actionbar/ActionBarButton;

    .line 24
    new-instance v0, Lcom/ibotta/android/view/actionbar/ActionBarButton;

    const-string v2, "RESEND_GIFT_CARD_EMAIL"

    const/4 v3, 0x6

    const v4, 0x7f09003a

    const/4 v5, -0x1

    const v6, 0x7f110044

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/ibotta/android/view/actionbar/ActionBarButton;-><init>(Ljava/lang/String;IIII)V

    sput-object v0, Lcom/ibotta/android/view/actionbar/ActionBarButton;->RESEND_GIFT_CARD_EMAIL:Lcom/ibotta/android/view/actionbar/ActionBarButton;

    .line 25
    new-instance v0, Lcom/ibotta/android/view/actionbar/ActionBarButton;

    const-string v8, "SAVE"

    const/4 v9, 0x7

    const v10, 0x7f09003c

    const v12, 0x7f110045

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/ibotta/android/view/actionbar/ActionBarButton;-><init>(Ljava/lang/String;IIII)V

    sput-object v0, Lcom/ibotta/android/view/actionbar/ActionBarButton;->SAVE:Lcom/ibotta/android/view/actionbar/ActionBarButton;

    .line 26
    new-instance v0, Lcom/ibotta/android/view/actionbar/ActionBarButton;

    const-string v2, "SHARE"

    const/16 v3, 0x8

    const v4, 0x7f09003d

    const v5, 0x7f08003c

    const v6, 0x7f110046

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/ibotta/android/view/actionbar/ActionBarButton;-><init>(Ljava/lang/String;IIII)V

    sput-object v0, Lcom/ibotta/android/view/actionbar/ActionBarButton;->SHARE:Lcom/ibotta/android/view/actionbar/ActionBarButton;

    .line 27
    new-instance v0, Lcom/ibotta/android/view/actionbar/ActionBarButton;

    const-string v8, "EDIT"

    const/16 v9, 0x9

    const v10, 0x7f090031

    const v11, 0x7f08003e

    const v12, 0x7f11003b

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/ibotta/android/view/actionbar/ActionBarButton;-><init>(Ljava/lang/String;IIII)V

    sput-object v0, Lcom/ibotta/android/view/actionbar/ActionBarButton;->EDIT:Lcom/ibotta/android/view/actionbar/ActionBarButton;

    .line 28
    new-instance v0, Lcom/ibotta/android/view/actionbar/ActionBarButton;

    const-string v2, "FLASH_OFF"

    const/16 v3, 0xa

    const v4, 0x7f090033

    const v5, 0x7f080017

    const v6, 0x7f11003d

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/ibotta/android/view/actionbar/ActionBarButton;-><init>(Ljava/lang/String;IIII)V

    sput-object v0, Lcom/ibotta/android/view/actionbar/ActionBarButton;->FLASH_OFF:Lcom/ibotta/android/view/actionbar/ActionBarButton;

    .line 29
    new-instance v0, Lcom/ibotta/android/view/actionbar/ActionBarButton;

    const-string v8, "FLASH_ON"

    const/16 v9, 0xb

    const v10, 0x7f090033

    const v11, 0x7f080016

    const v12, 0x7f11003d

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/ibotta/android/view/actionbar/ActionBarButton;-><init>(Ljava/lang/String;IIII)V

    sput-object v0, Lcom/ibotta/android/view/actionbar/ActionBarButton;->FLASH_ON:Lcom/ibotta/android/view/actionbar/ActionBarButton;

    .line 30
    new-instance v0, Lcom/ibotta/android/view/actionbar/ActionBarButton;

    const-string v2, "FAVORITE_OFF"

    const/16 v3, 0xc

    const v4, 0x7f090032

    const v5, 0x7f080179

    const v6, 0x7f11003c

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/ibotta/android/view/actionbar/ActionBarButton;-><init>(Ljava/lang/String;IIII)V

    sput-object v0, Lcom/ibotta/android/view/actionbar/ActionBarButton;->FAVORITE_OFF:Lcom/ibotta/android/view/actionbar/ActionBarButton;

    .line 31
    new-instance v0, Lcom/ibotta/android/view/actionbar/ActionBarButton;

    const-string v8, "FAVORITE_ON"

    const/16 v9, 0xd

    const v10, 0x7f090032

    const v11, 0x7f08017a

    const v12, 0x7f11003c

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/ibotta/android/view/actionbar/ActionBarButton;-><init>(Ljava/lang/String;IIII)V

    sput-object v0, Lcom/ibotta/android/view/actionbar/ActionBarButton;->FAVORITE_ON:Lcom/ibotta/android/view/actionbar/ActionBarButton;

    .line 32
    new-instance v0, Lcom/ibotta/android/view/actionbar/ActionBarButton;

    const-string v2, "SHOPPING_LIST"

    const/16 v3, 0xe

    const v4, 0x7f09003e

    const v5, 0x7f08002c

    const v6, 0x7f110047

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/ibotta/android/view/actionbar/ActionBarButton;-><init>(Ljava/lang/String;IIII)V

    sput-object v0, Lcom/ibotta/android/view/actionbar/ActionBarButton;->SHOPPING_LIST:Lcom/ibotta/android/view/actionbar/ActionBarButton;

    .line 33
    new-instance v0, Lcom/ibotta/android/view/actionbar/ActionBarButton;

    const-string v8, "MORE"

    const/16 v9, 0xf

    const v10, 0x7f090036

    const v11, 0x7f08002b

    const v12, 0x7f110040

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/ibotta/android/view/actionbar/ActionBarButton;-><init>(Ljava/lang/String;IIII)V

    sput-object v0, Lcom/ibotta/android/view/actionbar/ActionBarButton;->MORE:Lcom/ibotta/android/view/actionbar/ActionBarButton;

    .line 34
    new-instance v0, Lcom/ibotta/android/view/actionbar/ActionBarButton;

    const-string v2, "NOTIFICATION_COUNT"

    const/16 v3, 0x10

    const v4, 0x7f090037

    const/4 v5, -0x1

    const v6, 0x7f110041

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/ibotta/android/view/actionbar/ActionBarButton;-><init>(Ljava/lang/String;IIII)V

    sput-object v0, Lcom/ibotta/android/view/actionbar/ActionBarButton;->NOTIFICATION_COUNT:Lcom/ibotta/android/view/actionbar/ActionBarButton;

    .line 35
    new-instance v0, Lcom/ibotta/android/view/actionbar/ActionBarButton;

    const-string v8, "UNLOCKED_DEALS"

    const/16 v9, 0x11

    const v10, 0x7f090042

    const/4 v11, -0x1

    const v12, 0x7f110038

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/ibotta/android/view/actionbar/ActionBarButton;-><init>(Ljava/lang/String;IIII)V

    sput-object v0, Lcom/ibotta/android/view/actionbar/ActionBarButton;->UNLOCKED_DEALS:Lcom/ibotta/android/view/actionbar/ActionBarButton;

    const/16 v0, 0x12

    .line 16
    new-array v0, v0, [Lcom/ibotta/android/view/actionbar/ActionBarButton;

    sget-object v1, Lcom/ibotta/android/view/actionbar/ActionBarButton;->BARCODE:Lcom/ibotta/android/view/actionbar/ActionBarButton;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/view/actionbar/ActionBarButton;->DONE:Lcom/ibotta/android/view/actionbar/ActionBarButton;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/view/actionbar/ActionBarButton;->HELP:Lcom/ibotta/android/view/actionbar/ActionBarButton;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/view/actionbar/ActionBarButton;->LOG_OUT:Lcom/ibotta/android/view/actionbar/ActionBarButton;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/view/actionbar/ActionBarButton;->REFRESH:Lcom/ibotta/android/view/actionbar/ActionBarButton;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/view/actionbar/ActionBarButton;->REPLAY:Lcom/ibotta/android/view/actionbar/ActionBarButton;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/view/actionbar/ActionBarButton;->RESEND_GIFT_CARD_EMAIL:Lcom/ibotta/android/view/actionbar/ActionBarButton;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/view/actionbar/ActionBarButton;->SAVE:Lcom/ibotta/android/view/actionbar/ActionBarButton;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/view/actionbar/ActionBarButton;->SHARE:Lcom/ibotta/android/view/actionbar/ActionBarButton;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/view/actionbar/ActionBarButton;->EDIT:Lcom/ibotta/android/view/actionbar/ActionBarButton;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/view/actionbar/ActionBarButton;->FLASH_OFF:Lcom/ibotta/android/view/actionbar/ActionBarButton;

    const/16 v2, 0xa

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/view/actionbar/ActionBarButton;->FLASH_ON:Lcom/ibotta/android/view/actionbar/ActionBarButton;

    const/16 v2, 0xb

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/view/actionbar/ActionBarButton;->FAVORITE_OFF:Lcom/ibotta/android/view/actionbar/ActionBarButton;

    const/16 v2, 0xc

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/view/actionbar/ActionBarButton;->FAVORITE_ON:Lcom/ibotta/android/view/actionbar/ActionBarButton;

    const/16 v2, 0xd

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/view/actionbar/ActionBarButton;->SHOPPING_LIST:Lcom/ibotta/android/view/actionbar/ActionBarButton;

    const/16 v2, 0xe

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/view/actionbar/ActionBarButton;->MORE:Lcom/ibotta/android/view/actionbar/ActionBarButton;

    const/16 v2, 0xf

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/view/actionbar/ActionBarButton;->NOTIFICATION_COUNT:Lcom/ibotta/android/view/actionbar/ActionBarButton;

    const/16 v2, 0x10

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/view/actionbar/ActionBarButton;->UNLOCKED_DEALS:Lcom/ibotta/android/view/actionbar/ActionBarButton;

    const/16 v2, 0x11

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/android/view/actionbar/ActionBarButton;->$VALUES:[Lcom/ibotta/android/view/actionbar/ActionBarButton;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IIII)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(III)V"
        }
    .end annotation

    .line 42
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 43
    iput p3, p0, Lcom/ibotta/android/view/actionbar/ActionBarButton;->id:I

    .line 44
    iput p4, p0, Lcom/ibotta/android/view/actionbar/ActionBarButton;->image:I

    .line 45
    iput p5, p0, Lcom/ibotta/android/view/actionbar/ActionBarButton;->title:I

    return-void
.end method

.method public static buildIconStateDrawable(I)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 82
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, p0, v1}, Landroid/support/graphics/drawable/VectorDrawableCompat;->create(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/support/graphics/drawable/VectorDrawableCompat;

    move-result-object p0

    return-object p0
.end method

.method public static buildIconStateDrawable(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    .locals 3

    .line 86
    new-instance v0, Lcom/ibotta/android/view/drawable/IconStateDrawable;

    const/4 v1, 0x1

    new-array v1, v1, [Landroid/graphics/drawable/Drawable;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    invoke-direct {v0, v1}, Lcom/ibotta/android/view/drawable/IconStateDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    return-object v0
.end method

.method public static buildMenuItems([Lcom/ibotta/android/view/actionbar/ActionBarButton;Landroid/view/Menu;)Z
    .locals 6

    .line 63
    invoke-interface {p1}, Landroid/view/Menu;->clear()V

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    .line 64
    array-length v1, p0

    if-lez v1, :cond_2

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 65
    :goto_0
    array-length v3, p0

    if-ge v1, v3, :cond_1

    .line 66
    aget-object v2, p0, v1

    .line 67
    invoke-virtual {v2}, Lcom/ibotta/android/view/actionbar/ActionBarButton;->getId()I

    move-result v3

    invoke-virtual {v2}, Lcom/ibotta/android/view/actionbar/ActionBarButton;->getTitle()I

    move-result v4

    invoke-interface {p1, v0, v3, v1, v4}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v3

    .line 69
    invoke-virtual {v2}, Lcom/ibotta/android/view/actionbar/ActionBarButton;->getImage()I

    move-result v4

    const/4 v5, -0x1

    if-eq v4, v5, :cond_0

    .line 70
    invoke-virtual {v2}, Lcom/ibotta/android/view/actionbar/ActionBarButton;->getImage()I

    move-result v2

    invoke-static {v2}, Lcom/ibotta/android/view/actionbar/ActionBarButton;->buildIconStateDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-interface {v3, v2}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    :cond_0
    const/4 v2, 0x2

    .line 73
    invoke-static {v3, v2}, Landroid/support/v4/view/MenuItemCompat;->setShowAsAction(Landroid/view/MenuItem;I)V

    add-int/lit8 v1, v1, 0x1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    move v0, v2

    :cond_2
    return v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/view/actionbar/ActionBarButton;
    .locals 1

    .line 16
    const-class v0, Lcom/ibotta/android/view/actionbar/ActionBarButton;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/view/actionbar/ActionBarButton;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/view/actionbar/ActionBarButton;
    .locals 1

    .line 16
    sget-object v0, Lcom/ibotta/android/view/actionbar/ActionBarButton;->$VALUES:[Lcom/ibotta/android/view/actionbar/ActionBarButton;

    invoke-virtual {v0}, [Lcom/ibotta/android/view/actionbar/ActionBarButton;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/view/actionbar/ActionBarButton;

    return-object v0
.end method


# virtual methods
.method public getId()I
    .locals 1

    .line 49
    iget v0, p0, Lcom/ibotta/android/view/actionbar/ActionBarButton;->id:I

    return v0
.end method

.method public getImage()I
    .locals 1

    .line 53
    iget v0, p0, Lcom/ibotta/android/view/actionbar/ActionBarButton;->image:I

    return v0
.end method

.method public getTitle()I
    .locals 1

    .line 57
    iget v0, p0, Lcom/ibotta/android/view/actionbar/ActionBarButton;->title:I

    return v0
.end method
