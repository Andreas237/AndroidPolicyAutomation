.class public final enum Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;
.super Ljava/lang/Enum;
.source "PersonalStoreRowType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;

.field public static final enum STORE:Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;

.field public static final enum TITLE:Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 8
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;

    const-string v1, "TITLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;->TITLE:Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;

    .line 9
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;

    const-string v1, "STORE"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;->STORE:Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;

    const/4 v0, 0x2

    .line 7
    new-array v0, v0, [Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;

    sget-object v1, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;->TITLE:Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;->STORE:Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;

    aput-object v1, v0, v3

    sput-object v0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;->$VALUES:[Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 7
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;
    .locals 1

    .line 7
    const-class v0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;
    .locals 1

    .line 7
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;->$VALUES:[Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;

    invoke-virtual {v0}, [Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;

    return-object v0
.end method
