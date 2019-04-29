.class public final enum Lcom/yandex/metrica/profile/GenderAttribute$Gender;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/profile/GenderAttribute;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Gender"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/yandex/metrica/profile/GenderAttribute$Gender;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/yandex/metrica/profile/GenderAttribute$Gender;

.field public static final enum FEMALE:Lcom/yandex/metrica/profile/GenderAttribute$Gender;

.field public static final enum MALE:Lcom/yandex/metrica/profile/GenderAttribute$Gender;

.field public static final enum OTHER:Lcom/yandex/metrica/profile/GenderAttribute$Gender;


# instance fields
.field private final mStringValue:Ljava/lang/String;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 122
    new-instance v0, Lcom/yandex/metrica/profile/GenderAttribute$Gender;

    const-string v1, "MALE"

    const-string v2, "M"

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lcom/yandex/metrica/profile/GenderAttribute$Gender;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/profile/GenderAttribute$Gender;->MALE:Lcom/yandex/metrica/profile/GenderAttribute$Gender;

    .line 123
    new-instance v0, Lcom/yandex/metrica/profile/GenderAttribute$Gender;

    const-string v1, "FEMALE"

    const-string v2, "F"

    const/4 v4, 0x1

    invoke-direct {v0, v1, v4, v2}, Lcom/yandex/metrica/profile/GenderAttribute$Gender;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/profile/GenderAttribute$Gender;->FEMALE:Lcom/yandex/metrica/profile/GenderAttribute$Gender;

    .line 124
    new-instance v0, Lcom/yandex/metrica/profile/GenderAttribute$Gender;

    const-string v1, "OTHER"

    const-string v2, "O"

    const/4 v5, 0x2

    invoke-direct {v0, v1, v5, v2}, Lcom/yandex/metrica/profile/GenderAttribute$Gender;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/profile/GenderAttribute$Gender;->OTHER:Lcom/yandex/metrica/profile/GenderAttribute$Gender;

    const/4 v0, 0x3

    .line 121
    new-array v0, v0, [Lcom/yandex/metrica/profile/GenderAttribute$Gender;

    sget-object v1, Lcom/yandex/metrica/profile/GenderAttribute$Gender;->MALE:Lcom/yandex/metrica/profile/GenderAttribute$Gender;

    aput-object v1, v0, v3

    sget-object v1, Lcom/yandex/metrica/profile/GenderAttribute$Gender;->FEMALE:Lcom/yandex/metrica/profile/GenderAttribute$Gender;

    aput-object v1, v0, v4

    sget-object v1, Lcom/yandex/metrica/profile/GenderAttribute$Gender;->OTHER:Lcom/yandex/metrica/profile/GenderAttribute$Gender;

    aput-object v1, v0, v5

    sput-object v0, Lcom/yandex/metrica/profile/GenderAttribute$Gender;->$VALUES:[Lcom/yandex/metrica/profile/GenderAttribute$Gender;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .param p3    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 130
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 131
    iput-object p3, p0, Lcom/yandex/metrica/profile/GenderAttribute$Gender;->mStringValue:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/yandex/metrica/profile/GenderAttribute$Gender;
    .locals 1

    .line 121
    const-class v0, Lcom/yandex/metrica/profile/GenderAttribute$Gender;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/yandex/metrica/profile/GenderAttribute$Gender;

    return-object p0
.end method

.method public static values()[Lcom/yandex/metrica/profile/GenderAttribute$Gender;
    .locals 1

    .line 121
    sget-object v0, Lcom/yandex/metrica/profile/GenderAttribute$Gender;->$VALUES:[Lcom/yandex/metrica/profile/GenderAttribute$Gender;

    invoke-virtual {v0}, [Lcom/yandex/metrica/profile/GenderAttribute$Gender;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/yandex/metrica/profile/GenderAttribute$Gender;

    return-object v0
.end method


# virtual methods
.method public getStringValue()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 141
    iget-object v0, p0, Lcom/yandex/metrica/profile/GenderAttribute$Gender;->mStringValue:Ljava/lang/String;

    return-object v0
.end method
