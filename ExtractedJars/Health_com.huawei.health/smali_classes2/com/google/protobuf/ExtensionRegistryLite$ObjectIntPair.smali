.class final Lcom/google/protobuf/ExtensionRegistryLite$ObjectIntPair;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/ExtensionRegistryLite;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "ObjectIntPair"
.end annotation


# instance fields
.field private final number:I

.field private final object:Ljava/lang/Object;


# direct methods
.method constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 209
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 210
    iput-object p1, p0, Lcom/google/protobuf/ExtensionRegistryLite$ObjectIntPair;->object:Ljava/lang/Object;

    .line 211
    iput p2, p0, Lcom/google/protobuf/ExtensionRegistryLite$ObjectIntPair;->number:I

    .line 212
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 220
    instance-of v0, p1, Lcom/google/protobuf/ExtensionRegistryLite$ObjectIntPair;

    if-nez v0, :cond_0

    .line 221
    const/4 v0, 0x0

    return v0

    .line 223
    :cond_0
    move-object v2, p1

    check-cast v2, Lcom/google/protobuf/ExtensionRegistryLite$ObjectIntPair;

    .line 224
    iget-object v0, p0, Lcom/google/protobuf/ExtensionRegistryLite$ObjectIntPair;->object:Ljava/lang/Object;

    iget-object v1, v2, Lcom/google/protobuf/ExtensionRegistryLite$ObjectIntPair;->object:Ljava/lang/Object;

    if-ne v0, v1, :cond_1

    iget v0, p0, Lcom/google/protobuf/ExtensionRegistryLite$ObjectIntPair;->number:I

    iget v1, v2, Lcom/google/protobuf/ExtensionRegistryLite$ObjectIntPair;->number:I

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 216
    iget-object v0, p0, Lcom/google/protobuf/ExtensionRegistryLite$ObjectIntPair;->object:Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    const v1, 0xffff

    mul-int/2addr v0, v1

    iget v1, p0, Lcom/google/protobuf/ExtensionRegistryLite$ObjectIntPair;->number:I

    add-int/2addr v0, v1

    return v0
.end method
