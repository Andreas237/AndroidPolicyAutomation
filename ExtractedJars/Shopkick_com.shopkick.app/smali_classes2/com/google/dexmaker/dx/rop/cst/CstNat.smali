.class public final Lcom/google/dexmaker/dx/rop/cst/CstNat;
.super Lcom/google/dexmaker/dx/rop/cst/Constant;
.source "CstNat.java"


# static fields
.field public static final PRIMITIVE_TYPE_NAT:Lcom/google/dexmaker/dx/rop/cst/CstNat;


# instance fields
.field private final descriptor:Lcom/google/dexmaker/dx/rop/cst/CstString;

.field private final name:Lcom/google/dexmaker/dx/rop/cst/CstString;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 30
    new-instance v0, Lcom/google/dexmaker/dx/rop/cst/CstNat;

    new-instance v1, Lcom/google/dexmaker/dx/rop/cst/CstString;

    const-string v2, "TYPE"

    invoke-direct {v1, v2}, Lcom/google/dexmaker/dx/rop/cst/CstString;-><init>(Ljava/lang/String;)V

    new-instance v2, Lcom/google/dexmaker/dx/rop/cst/CstString;

    const-string v3, "Ljava/lang/Class;"

    invoke-direct {v2, v3}, Lcom/google/dexmaker/dx/rop/cst/CstString;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1, v2}, Lcom/google/dexmaker/dx/rop/cst/CstNat;-><init>(Lcom/google/dexmaker/dx/rop/cst/CstString;Lcom/google/dexmaker/dx/rop/cst/CstString;)V

    sput-object v0, Lcom/google/dexmaker/dx/rop/cst/CstNat;->PRIMITIVE_TYPE_NAT:Lcom/google/dexmaker/dx/rop/cst/CstNat;

    return-void
.end method

.method public constructor <init>(Lcom/google/dexmaker/dx/rop/cst/CstString;Lcom/google/dexmaker/dx/rop/cst/CstString;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Lcom/google/dexmaker/dx/rop/cst/Constant;-><init>()V

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    .line 55
    iput-object p1, p0, Lcom/google/dexmaker/dx/rop/cst/CstNat;->name:Lcom/google/dexmaker/dx/rop/cst/CstString;

    .line 56
    iput-object p2, p0, Lcom/google/dexmaker/dx/rop/cst/CstNat;->descriptor:Lcom/google/dexmaker/dx/rop/cst/CstString;

    return-void

    .line 52
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "descriptor == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 48
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "name == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method protected compareTo0(Lcom/google/dexmaker/dx/rop/cst/Constant;)I
    .locals 2

    .line 80
    check-cast p1, Lcom/google/dexmaker/dx/rop/cst/CstNat;

    .line 81
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/cst/CstNat;->name:Lcom/google/dexmaker/dx/rop/cst/CstString;

    iget-object v1, p1, Lcom/google/dexmaker/dx/rop/cst/CstNat;->name:Lcom/google/dexmaker/dx/rop/cst/CstString;

    invoke-virtual {v0, v1}, Lcom/google/dexmaker/dx/rop/cst/CstString;->compareTo(Lcom/google/dexmaker/dx/rop/cst/Constant;)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    .line 87
    :cond_0
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/cst/CstNat;->descriptor:Lcom/google/dexmaker/dx/rop/cst/CstString;

    iget-object p1, p1, Lcom/google/dexmaker/dx/rop/cst/CstNat;->descriptor:Lcom/google/dexmaker/dx/rop/cst/CstString;

    invoke-virtual {v0, p1}, Lcom/google/dexmaker/dx/rop/cst/CstString;->compareTo(Lcom/google/dexmaker/dx/rop/cst/Constant;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 62
    instance-of v0, p1, Lcom/google/dexmaker/dx/rop/cst/CstNat;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 66
    :cond_0
    check-cast p1, Lcom/google/dexmaker/dx/rop/cst/CstNat;

    .line 67
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/cst/CstNat;->name:Lcom/google/dexmaker/dx/rop/cst/CstString;

    iget-object v2, p1, Lcom/google/dexmaker/dx/rop/cst/CstNat;->name:Lcom/google/dexmaker/dx/rop/cst/CstString;

    invoke-virtual {v0, v2}, Lcom/google/dexmaker/dx/rop/cst/CstString;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/cst/CstNat;->descriptor:Lcom/google/dexmaker/dx/rop/cst/CstString;

    iget-object p1, p1, Lcom/google/dexmaker/dx/rop/cst/CstNat;->descriptor:Lcom/google/dexmaker/dx/rop/cst/CstString;

    invoke-virtual {v0, p1}, Lcom/google/dexmaker/dx/rop/cst/CstString;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public getDescriptor()Lcom/google/dexmaker/dx/rop/cst/CstString;
    .locals 1

    .line 123
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/cst/CstNat;->descriptor:Lcom/google/dexmaker/dx/rop/cst/CstString;

    return-object v0
.end method

.method public getFieldType()Lcom/google/dexmaker/dx/rop/type/Type;
    .locals 1

    .line 144
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/cst/CstNat;->descriptor:Lcom/google/dexmaker/dx/rop/cst/CstString;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/cst/CstString;->getString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/type/Type;->intern(Ljava/lang/String;)Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object v0

    return-object v0
.end method

.method public getName()Lcom/google/dexmaker/dx/rop/cst/CstString;
    .locals 1

    .line 114
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/cst/CstNat;->name:Lcom/google/dexmaker/dx/rop/cst/CstString;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 74
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/cst/CstNat;->name:Lcom/google/dexmaker/dx/rop/cst/CstString;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/cst/CstString;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/dexmaker/dx/rop/cst/CstNat;->descriptor:Lcom/google/dexmaker/dx/rop/cst/CstString;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/cst/CstString;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public isCategory2()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final isClassInit()Z
    .locals 2

    .line 168
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/cst/CstNat;->name:Lcom/google/dexmaker/dx/rop/cst/CstString;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/cst/CstString;->getString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "<clinit>"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final isInstanceInit()Z
    .locals 2

    .line 156
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/cst/CstNat;->name:Lcom/google/dexmaker/dx/rop/cst/CstString;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/cst/CstString;->getString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "<init>"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public toHuman()Ljava/lang/String;
    .locals 2

    .line 133
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/google/dexmaker/dx/rop/cst/CstNat;->name:Lcom/google/dexmaker/dx/rop/cst/CstString;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/cst/CstString;->toHuman()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3a

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/google/dexmaker/dx/rop/cst/CstNat;->descriptor:Lcom/google/dexmaker/dx/rop/cst/CstString;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/cst/CstString;->toHuman()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 93
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "nat{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/cst/CstNat;->toHuman()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public typeName()Ljava/lang/String;
    .locals 1

    const-string v0, "nat"

    return-object v0
.end method
