.class final Lcom/google/protobuf/Syntax$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/Internal$EnumLiteMap;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/Syntax;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lcom/google/protobuf/Internal$EnumLiteMap<Lcom/google/protobuf/Syntax;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic findValueByNumber(I)Lcom/google/protobuf/Internal$EnumLite;
    .locals 1

    .line 82
    invoke-virtual {p0, p1}, Lcom/google/protobuf/Syntax$1;->findValueByNumber(I)Lcom/google/protobuf/Syntax;

    move-result-object v0

    return-object v0
.end method

.method public findValueByNumber(I)Lcom/google/protobuf/Syntax;
    .locals 1

    .line 84
    invoke-static {p1}, Lcom/google/protobuf/Syntax;->forNumber(I)Lcom/google/protobuf/Syntax;

    move-result-object v0

    return-object v0
.end method
