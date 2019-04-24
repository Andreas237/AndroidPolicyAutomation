.class public abstract enum Lcom/ibotta/android/graphql/type/CustomType;
.super Ljava/lang/Enum;
.source "CustomType.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ScalarType;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/graphql/type/CustomType;",
        ">;",
        "Lcom/apollographql/apollo/api/ScalarType;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/graphql/type/CustomType;

.field public static final enum ID:Lcom/ibotta/android/graphql/type/CustomType;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 11
    new-instance v0, Lcom/ibotta/android/graphql/type/CustomType$1;

    const-string v1, "ID"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/graphql/type/CustomType$1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/graphql/type/CustomType;->ID:Lcom/ibotta/android/graphql/type/CustomType;

    const/4 v0, 0x1

    .line 9
    new-array v0, v0, [Lcom/ibotta/android/graphql/type/CustomType;

    sget-object v1, Lcom/ibotta/android/graphql/type/CustomType;->ID:Lcom/ibotta/android/graphql/type/CustomType;

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/android/graphql/type/CustomType;->$VALUES:[Lcom/ibotta/android/graphql/type/CustomType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 10
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ILcom/ibotta/android/graphql/type/CustomType$1;)V
    .locals 0

    .line 10
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/graphql/type/CustomType;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/graphql/type/CustomType;
    .locals 1

    .line 9
    const-class v0, Lcom/ibotta/android/graphql/type/CustomType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/graphql/type/CustomType;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/graphql/type/CustomType;
    .locals 1

    .line 9
    sget-object v0, Lcom/ibotta/android/graphql/type/CustomType;->$VALUES:[Lcom/ibotta/android/graphql/type/CustomType;

    invoke-virtual {v0}, [Lcom/ibotta/android/graphql/type/CustomType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/graphql/type/CustomType;

    return-object v0
.end method
