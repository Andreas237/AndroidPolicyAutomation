.class final Lcom/google/protobuf/ExtensionRegistry$DescriptorIntPair;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/ExtensionRegistry;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "DescriptorIntPair"
.end annotation


# instance fields
.field private final descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

.field private final number:I


# direct methods
.method constructor <init>(Lcom/google/protobuf/Descriptors$Descriptor;I)V
    .locals 0

    .line 378
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 379
    iput-object p1, p0, Lcom/google/protobuf/ExtensionRegistry$DescriptorIntPair;->descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 380
    iput p2, p0, Lcom/google/protobuf/ExtensionRegistry$DescriptorIntPair;->number:I

    .line 381
    return-void
.end method

.method static synthetic access$000(Lcom/google/protobuf/ExtensionRegistry$DescriptorIntPair;)Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 374
    iget-object v0, p0, Lcom/google/protobuf/ExtensionRegistry$DescriptorIntPair;->descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 389
    instance-of v0, p1, Lcom/google/protobuf/ExtensionRegistry$DescriptorIntPair;

    if-nez v0, :cond_0

    .line 390
    const/4 v0, 0x0

    return v0

    .line 392
    :cond_0
    move-object v2, p1

    check-cast v2, Lcom/google/protobuf/ExtensionRegistry$DescriptorIntPair;

    .line 393
    iget-object v0, p0, Lcom/google/protobuf/ExtensionRegistry$DescriptorIntPair;->descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    iget-object v1, v2, Lcom/google/protobuf/ExtensionRegistry$DescriptorIntPair;->descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    if-ne v0, v1, :cond_1

    iget v0, p0, Lcom/google/protobuf/ExtensionRegistry$DescriptorIntPair;->number:I

    iget v1, v2, Lcom/google/protobuf/ExtensionRegistry$DescriptorIntPair;->number:I

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

    .line 385
    iget-object v0, p0, Lcom/google/protobuf/ExtensionRegistry$DescriptorIntPair;->descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const v1, 0xffff

    mul-int/2addr v0, v1

    iget v1, p0, Lcom/google/protobuf/ExtensionRegistry$DescriptorIntPair;->number:I

    add-int/2addr v0, v1

    return v0
.end method
