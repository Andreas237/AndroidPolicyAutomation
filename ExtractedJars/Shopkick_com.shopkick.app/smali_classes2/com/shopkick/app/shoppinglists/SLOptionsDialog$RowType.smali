.class public final enum Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;
.super Ljava/lang/Enum;
.source "SLOptionsDialog.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/shoppinglists/SLOptionsDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "RowType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;

.field public static final enum QUANTITY_PICKER:Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;

.field public static final enum TEXT:Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 31
    new-instance v0, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;

    const-string v1, "TEXT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;->TEXT:Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;

    .line 32
    new-instance v0, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;

    const-string v1, "QUANTITY_PICKER"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;->QUANTITY_PICKER:Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;

    const/4 v0, 0x2

    .line 30
    new-array v0, v0, [Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;

    sget-object v1, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;->TEXT:Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;->QUANTITY_PICKER:Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;

    aput-object v1, v0, v3

    sput-object v0, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;->$VALUES:[Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 30
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;
    .locals 1

    .line 30
    const-class v0, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;
    .locals 1

    .line 30
    sget-object v0, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;->$VALUES:[Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;

    invoke-virtual {v0}, [Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;

    return-object v0
.end method
