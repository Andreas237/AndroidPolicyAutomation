.class public final enum Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;
.super Ljava/lang/Enum;
.source "InvitePromoCodeViewModel.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/invite/InvitePromoCodeViewModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ShareChannel"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;

.field public static final enum COPY_TO_CLIPBOARD:Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;

.field public static final enum EMAIL:Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;

.field public static final enum FACEBOOK:Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;

.field public static final enum NATIVE:Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;

.field public static final enum SMS:Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 41
    new-instance v0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;

    const-string v1, "NATIVE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;->NATIVE:Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;

    new-instance v0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;

    const-string v1, "FACEBOOK"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;->FACEBOOK:Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;

    new-instance v0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;

    const-string v1, "EMAIL"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;->EMAIL:Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;

    new-instance v0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;

    const-string v1, "SMS"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;->SMS:Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;

    new-instance v0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;

    const-string v1, "COPY_TO_CLIPBOARD"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;->COPY_TO_CLIPBOARD:Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;

    const/4 v0, 0x5

    .line 40
    new-array v0, v0, [Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;

    sget-object v1, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;->NATIVE:Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;->FACEBOOK:Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;

    aput-object v1, v0, v3

    sget-object v1, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;->EMAIL:Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;

    aput-object v1, v0, v4

    sget-object v1, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;->SMS:Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;

    aput-object v1, v0, v5

    sget-object v1, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;->COPY_TO_CLIPBOARD:Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;

    aput-object v1, v0, v6

    sput-object v0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;->$VALUES:[Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 40
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;
    .locals 1

    .line 40
    const-class v0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;
    .locals 1

    .line 40
    sget-object v0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;->$VALUES:[Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;

    invoke-virtual {v0}, [Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;

    return-object v0
.end method
