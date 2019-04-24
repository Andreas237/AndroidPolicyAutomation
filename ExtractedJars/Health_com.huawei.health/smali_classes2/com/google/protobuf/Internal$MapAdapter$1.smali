.class final Lcom/google/protobuf/Internal$MapAdapter$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/Internal$MapAdapter$Converter;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/protobuf/Internal$MapAdapter;->newEnumConverter(Lcom/google/protobuf/Internal$EnumLiteMap;Lcom/google/protobuf/Internal$EnumLite;)Lcom/google/protobuf/Internal$MapAdapter$Converter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lcom/google/protobuf/Internal$MapAdapter$Converter<Ljava/lang/Integer;TT;>;"
    }
.end annotation


# instance fields
.field final synthetic val$enumMap:Lcom/google/protobuf/Internal$EnumLiteMap;

.field final synthetic val$unrecognizedValue:Lcom/google/protobuf/Internal$EnumLite;


# direct methods
.method constructor <init>(Lcom/google/protobuf/Internal$EnumLiteMap;Lcom/google/protobuf/Internal$EnumLite;)V
    .locals 0

    .line 484
    iput-object p1, p0, Lcom/google/protobuf/Internal$MapAdapter$1;->val$enumMap:Lcom/google/protobuf/Internal$EnumLiteMap;

    iput-object p2, p0, Lcom/google/protobuf/Internal$MapAdapter$1;->val$unrecognizedValue:Lcom/google/protobuf/Internal$EnumLite;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public doBackward(Lcom/google/protobuf/Internal$EnumLite;)Ljava/lang/Integer;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Ljava/lang/Integer;"
        }
    .end annotation

    .line 493
    invoke-interface {p1}, Lcom/google/protobuf/Internal$EnumLite;->getNumber()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic doBackward(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 484
    move-object v0, p1

    check-cast v0, Lcom/google/protobuf/Internal$EnumLite;

    invoke-virtual {p0, v0}, Lcom/google/protobuf/Internal$MapAdapter$1;->doBackward(Lcom/google/protobuf/Internal$EnumLite;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public doForward(Ljava/lang/Integer;)Lcom/google/protobuf/Internal$EnumLite;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Integer;)TT;"
        }
    .end annotation

    .line 487
    iget-object v0, p0, Lcom/google/protobuf/Internal$MapAdapter$1;->val$enumMap:Lcom/google/protobuf/Internal$EnumLiteMap;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/google/protobuf/Internal$EnumLiteMap;->findValueByNumber(I)Lcom/google/protobuf/Internal$EnumLite;

    move-result-object v2

    .line 488
    if-nez v2, :cond_0

    iget-object v0, p0, Lcom/google/protobuf/Internal$MapAdapter$1;->val$unrecognizedValue:Lcom/google/protobuf/Internal$EnumLite;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    return-object v0
.end method

.method public bridge synthetic doForward(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 484
    move-object v0, p1

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {p0, v0}, Lcom/google/protobuf/Internal$MapAdapter$1;->doForward(Ljava/lang/Integer;)Lcom/google/protobuf/Internal$EnumLite;

    move-result-object v0

    return-object v0
.end method
