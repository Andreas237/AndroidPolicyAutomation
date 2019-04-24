.class public final enum Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareButtonExpGroup;
.super Ljava/lang/Enum;
.source "InvitePromoCodeViewModel.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/invite/InvitePromoCodeViewModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ShareButtonExpGroup"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareButtonExpGroup;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareButtonExpGroup;

.field public static final enum SHARE_ICONS:Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareButtonExpGroup;

.field public static final enum STATIC_ON_SCREEN:Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareButtonExpGroup;

.field public static final enum STICKY_TO_BOTTOM:Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareButtonExpGroup;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 48
    new-instance v0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareButtonExpGroup;

    const-string v1, "STATIC_ON_SCREEN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareButtonExpGroup;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareButtonExpGroup;->STATIC_ON_SCREEN:Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareButtonExpGroup;

    new-instance v0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareButtonExpGroup;

    const-string v1, "STICKY_TO_BOTTOM"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareButtonExpGroup;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareButtonExpGroup;->STICKY_TO_BOTTOM:Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareButtonExpGroup;

    new-instance v0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareButtonExpGroup;

    const-string v1, "SHARE_ICONS"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareButtonExpGroup;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareButtonExpGroup;->SHARE_ICONS:Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareButtonExpGroup;

    const/4 v0, 0x3

    .line 47
    new-array v0, v0, [Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareButtonExpGroup;

    sget-object v1, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareButtonExpGroup;->STATIC_ON_SCREEN:Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareButtonExpGroup;

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareButtonExpGroup;->STICKY_TO_BOTTOM:Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareButtonExpGroup;

    aput-object v1, v0, v3

    sget-object v1, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareButtonExpGroup;->SHARE_ICONS:Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareButtonExpGroup;

    aput-object v1, v0, v4

    sput-object v0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareButtonExpGroup;->$VALUES:[Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareButtonExpGroup;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 47
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareButtonExpGroup;
    .locals 1

    .line 47
    const-class v0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareButtonExpGroup;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareButtonExpGroup;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareButtonExpGroup;
    .locals 1

    .line 47
    sget-object v0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareButtonExpGroup;->$VALUES:[Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareButtonExpGroup;

    invoke-virtual {v0}, [Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareButtonExpGroup;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareButtonExpGroup;

    return-object v0
.end method
