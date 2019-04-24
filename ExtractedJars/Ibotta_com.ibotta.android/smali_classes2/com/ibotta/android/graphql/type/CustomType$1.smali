.class final enum Lcom/ibotta/android/graphql/type/CustomType$1;
.super Lcom/ibotta/android/graphql/type/CustomType;
.source "CustomType.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/type/CustomType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4010
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 11
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/graphql/type/CustomType;-><init>(Ljava/lang/String;ILcom/ibotta/android/graphql/type/CustomType$1;)V

    return-void
.end method


# virtual methods
.method public javaType()Ljava/lang/Class;
    .locals 1

    .line 19
    const-class v0, Ljava/lang/String;

    return-object v0
.end method

.method public typeName()Ljava/lang/String;
    .locals 1

    const-string v0, "ID"

    return-object v0
.end method
