.class public final Lcom/google/dexmaker/dx/rop/code/RegisterSpec;
.super Ljava/lang/Object;
.source "RegisterSpec.java"

# interfaces
.implements Lcom/google/dexmaker/dx/rop/type/TypeBearer;
.implements Lcom/google/dexmaker/dx/util/ToHuman;
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/dexmaker/dx/rop/code/RegisterSpec$ForComparison;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/dexmaker/dx/rop/type/TypeBearer;",
        "Lcom/google/dexmaker/dx/util/ToHuman;",
        "Ljava/lang/Comparable<",
        "Lcom/google/dexmaker/dx/rop/code/RegisterSpec;",
        ">;"
    }
.end annotation


# static fields
.field public static final PREFIX:Ljava/lang/String; = "v"

.field private static final theInterningItem:Lcom/google/dexmaker/dx/rop/code/RegisterSpec$ForComparison;

.field private static final theInterns:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Object;",
            "Lcom/google/dexmaker/dx/rop/code/RegisterSpec;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final local:Lcom/google/dexmaker/dx/rop/code/LocalItem;

.field private final reg:I

.field private final type:Lcom/google/dexmaker/dx/rop/type/TypeBearer;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 37
    new-instance v0, Ljava/util/HashMap;

    const/16 v1, 0x3e8

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    sput-object v0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->theInterns:Ljava/util/HashMap;

    .line 41
    new-instance v0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec$ForComparison;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec$ForComparison;-><init>(Lcom/google/dexmaker/dx/rop/code/RegisterSpec$1;)V

    sput-object v0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->theInterningItem:Lcom/google/dexmaker/dx/rop/code/RegisterSpec$ForComparison;

    return-void
.end method

.method private constructor <init>(ILcom/google/dexmaker/dx/rop/type/TypeBearer;Lcom/google/dexmaker/dx/rop/code/LocalItem;)V
    .locals 0

    .line 151
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-ltz p1, :cond_1

    if-eqz p2, :cond_0

    .line 160
    iput p1, p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->reg:I

    .line 161
    iput-object p2, p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->type:Lcom/google/dexmaker/dx/rop/type/TypeBearer;

    .line 162
    iput-object p3, p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->local:Lcom/google/dexmaker/dx/rop/code/LocalItem;

    return-void

    .line 157
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string/jumbo p2, "type == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 153
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "reg < 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method synthetic constructor <init>(ILcom/google/dexmaker/dx/rop/type/TypeBearer;Lcom/google/dexmaker/dx/rop/code/LocalItem;Lcom/google/dexmaker/dx/rop/code/RegisterSpec$1;)V
    .locals 0

    .line 31
    invoke-direct {p0, p1, p2, p3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;-><init>(ILcom/google/dexmaker/dx/rop/type/TypeBearer;Lcom/google/dexmaker/dx/rop/code/LocalItem;)V

    return-void
.end method

.method static synthetic access$500(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;ILcom/google/dexmaker/dx/rop/type/TypeBearer;Lcom/google/dexmaker/dx/rop/code/LocalItem;)Z
    .locals 0

    .line 31
    invoke-direct {p0, p1, p2, p3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->equals(ILcom/google/dexmaker/dx/rop/type/TypeBearer;Lcom/google/dexmaker/dx/rop/code/LocalItem;)Z

    move-result p0

    return p0
.end method

.method static synthetic access$600(ILcom/google/dexmaker/dx/rop/type/TypeBearer;Lcom/google/dexmaker/dx/rop/code/LocalItem;)I
    .locals 0

    .line 31
    invoke-static {p0, p1, p2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->hashCodeOf(ILcom/google/dexmaker/dx/rop/type/TypeBearer;Lcom/google/dexmaker/dx/rop/code/LocalItem;)I

    move-result p0

    return p0
.end method

.method private equals(ILcom/google/dexmaker/dx/rop/type/TypeBearer;Lcom/google/dexmaker/dx/rop/code/LocalItem;)Z
    .locals 1

    .line 228
    iget v0, p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->reg:I

    if-ne v0, p1, :cond_1

    iget-object p1, p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->type:Lcom/google/dexmaker/dx/rop/type/TypeBearer;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->local:Lcom/google/dexmaker/dx/rop/code/LocalItem;

    if-eq p1, p3, :cond_0

    if-eqz p1, :cond_1

    invoke-virtual {p1, p3}, Lcom/google/dexmaker/dx/rop/code/LocalItem;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private static hashCodeOf(ILcom/google/dexmaker/dx/rop/type/TypeBearer;Lcom/google/dexmaker/dx/rop/code/LocalItem;)I
    .locals 0

    if-eqz p2, :cond_0

    .line 279
    invoke-virtual {p2}, Lcom/google/dexmaker/dx/rop/code/LocalItem;->hashCode()I

    move-result p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    mul-int/lit8 p2, p2, 0x1f

    .line 281
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    add-int/2addr p2, p1

    mul-int/lit8 p2, p2, 0x1f

    add-int/2addr p2, p0

    return p2
.end method

.method private static intern(ILcom/google/dexmaker/dx/rop/type/TypeBearer;Lcom/google/dexmaker/dx/rop/code/LocalItem;)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;
    .locals 2

    .line 66
    sget-object v0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->theInterns:Ljava/util/HashMap;

    monitor-enter v0

    .line 67
    :try_start_0
    sget-object v1, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->theInterningItem:Lcom/google/dexmaker/dx/rop/code/RegisterSpec$ForComparison;

    invoke-virtual {v1, p0, p1, p2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec$ForComparison;->set(ILcom/google/dexmaker/dx/rop/type/TypeBearer;Lcom/google/dexmaker/dx/rop/code/LocalItem;)V

    .line 68
    sget-object p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->theInterns:Ljava/util/HashMap;

    sget-object p1, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->theInterningItem:Lcom/google/dexmaker/dx/rop/code/RegisterSpec$ForComparison;

    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    if-eqz p0, :cond_0

    .line 71
    monitor-exit v0

    return-object p0

    .line 74
    :cond_0
    sget-object p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->theInterningItem:Lcom/google/dexmaker/dx/rop/code/RegisterSpec$ForComparison;

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec$ForComparison;->toRegisterSpec()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p0

    .line 75
    sget-object p1, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->theInterns:Ljava/util/HashMap;

    invoke-virtual {p1, p0, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    .line 77
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static make(ILcom/google/dexmaker/dx/rop/type/TypeBearer;)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;
    .locals 1

    const/4 v0, 0x0

    .line 91
    invoke-static {p0, p1, v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->intern(ILcom/google/dexmaker/dx/rop/type/TypeBearer;Lcom/google/dexmaker/dx/rop/code/LocalItem;)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p0

    return-object p0
.end method

.method public static make(ILcom/google/dexmaker/dx/rop/type/TypeBearer;Lcom/google/dexmaker/dx/rop/code/LocalItem;)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;
    .locals 0

    if-eqz p2, :cond_0

    .line 111
    invoke-static {p0, p1, p2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->intern(ILcom/google/dexmaker/dx/rop/type/TypeBearer;Lcom/google/dexmaker/dx/rop/code/LocalItem;)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p0

    return-object p0

    .line 108
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "local  == null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static makeLocalOptional(ILcom/google/dexmaker/dx/rop/type/TypeBearer;Lcom/google/dexmaker/dx/rop/code/LocalItem;)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;
    .locals 0

    .line 129
    invoke-static {p0, p1, p2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->intern(ILcom/google/dexmaker/dx/rop/type/TypeBearer;Lcom/google/dexmaker/dx/rop/code/LocalItem;)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p0

    return-object p0
.end method

.method public static regString(I)Ljava/lang/String;
    .locals 2

    .line 139
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "v"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private toString0(Z)Ljava/lang/String;
    .locals 3

    .line 570
    new-instance v0, Ljava/lang/StringBuffer;

    const/16 v1, 0x28

    invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(I)V

    .line 572
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->regString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v1, ":"

    .line 573
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 575
    iget-object v1, p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->local:Lcom/google/dexmaker/dx/rop/code/LocalItem;

    if-eqz v1, :cond_0

    .line 576
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/code/LocalItem;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 579
    :cond_0
    iget-object v1, p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->type:Lcom/google/dexmaker/dx/rop/type/TypeBearer;

    invoke-interface {v1}, Lcom/google/dexmaker/dx/rop/type/TypeBearer;->getType()Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object v1

    .line 580
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    .line 582
    iget-object v2, p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->type:Lcom/google/dexmaker/dx/rop/type/TypeBearer;

    if-eq v1, v2, :cond_3

    const-string v1, "="

    .line 583
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    if-eqz p1, :cond_1

    .line 584
    iget-object v1, p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->type:Lcom/google/dexmaker/dx/rop/type/TypeBearer;

    instance-of v2, v1, Lcom/google/dexmaker/dx/rop/cst/CstString;

    if-eqz v2, :cond_1

    .line 585
    check-cast v1, Lcom/google/dexmaker/dx/rop/cst/CstString;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/cst/CstString;->toQuoted()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_2

    .line 586
    iget-object p1, p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->type:Lcom/google/dexmaker/dx/rop/type/TypeBearer;

    instance-of v1, p1, Lcom/google/dexmaker/dx/rop/cst/Constant;

    if-eqz v1, :cond_2

    .line 587
    invoke-interface {p1}, Lcom/google/dexmaker/dx/rop/type/TypeBearer;->toHuman()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_0

    .line 589
    :cond_2
    iget-object p1, p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->type:Lcom/google/dexmaker/dx/rop/type/TypeBearer;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    .line 593
    :cond_3
    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public compareTo(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)I
    .locals 4

    .line 242
    iget v0, p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->reg:I

    iget v1, p1, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->reg:I

    const/4 v2, -0x1

    if-ge v0, v1, :cond_0

    return v2

    :cond_0
    const/4 v3, 0x1

    if-le v0, v1, :cond_1

    return v3

    .line 248
    :cond_1
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->type:Lcom/google/dexmaker/dx/rop/type/TypeBearer;

    invoke-interface {v0}, Lcom/google/dexmaker/dx/rop/type/TypeBearer;->getType()Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object v0

    iget-object v1, p1, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->type:Lcom/google/dexmaker/dx/rop/type/TypeBearer;

    invoke-interface {v1}, Lcom/google/dexmaker/dx/rop/type/TypeBearer;->getType()Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/dexmaker/dx/rop/type/Type;->compareTo(Lcom/google/dexmaker/dx/rop/type/Type;)I

    move-result v0

    if-eqz v0, :cond_2

    return v0

    .line 254
    :cond_2
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->local:Lcom/google/dexmaker/dx/rop/code/LocalItem;

    if-nez v0, :cond_4

    .line 255
    iget-object p1, p1, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->local:Lcom/google/dexmaker/dx/rop/code/LocalItem;

    if-nez p1, :cond_3

    const/4 v2, 0x0

    :cond_3
    return v2

    .line 256
    :cond_4
    iget-object p1, p1, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->local:Lcom/google/dexmaker/dx/rop/code/LocalItem;

    if-nez p1, :cond_5

    return v3

    .line 260
    :cond_5
    invoke-virtual {v0, p1}, Lcom/google/dexmaker/dx/rop/code/LocalItem;->compareTo(Lcom/google/dexmaker/dx/rop/code/LocalItem;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 31
    check-cast p1, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    invoke-virtual {p0, p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->compareTo(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 168
    instance-of v0, p1, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    if-nez v0, :cond_1

    .line 169
    instance-of v0, p1, Lcom/google/dexmaker/dx/rop/code/RegisterSpec$ForComparison;

    if-eqz v0, :cond_0

    .line 170
    check-cast p1, Lcom/google/dexmaker/dx/rop/code/RegisterSpec$ForComparison;

    .line 171
    invoke-static {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec$ForComparison;->access$100(Lcom/google/dexmaker/dx/rop/code/RegisterSpec$ForComparison;)I

    move-result v0

    invoke-static {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec$ForComparison;->access$200(Lcom/google/dexmaker/dx/rop/code/RegisterSpec$ForComparison;)Lcom/google/dexmaker/dx/rop/type/TypeBearer;

    move-result-object v1

    invoke-static {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec$ForComparison;->access$300(Lcom/google/dexmaker/dx/rop/code/RegisterSpec$ForComparison;)Lcom/google/dexmaker/dx/rop/code/LocalItem;

    move-result-object p1

    invoke-direct {p0, v0, v1, p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->equals(ILcom/google/dexmaker/dx/rop/type/TypeBearer;Lcom/google/dexmaker/dx/rop/code/LocalItem;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1

    .line 176
    :cond_1
    check-cast p1, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    .line 177
    iget v0, p1, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->reg:I

    iget-object v1, p1, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->type:Lcom/google/dexmaker/dx/rop/type/TypeBearer;

    iget-object p1, p1, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->local:Lcom/google/dexmaker/dx/rop/code/LocalItem;

    invoke-direct {p0, v0, v1, p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->equals(ILcom/google/dexmaker/dx/rop/type/TypeBearer;Lcom/google/dexmaker/dx/rop/code/LocalItem;)Z

    move-result p1

    return p1
.end method

.method public equalsUsingSimpleType(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Z
    .locals 2

    .line 191
    invoke-virtual {p0, p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->matchesVariable(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 195
    :cond_0
    iget v0, p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->reg:I

    iget p1, p1, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->reg:I

    if-ne v0, p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public final getBasicFrameType()I
    .locals 1

    .line 313
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->type:Lcom/google/dexmaker/dx/rop/type/TypeBearer;

    invoke-interface {v0}, Lcom/google/dexmaker/dx/rop/type/TypeBearer;->getBasicFrameType()I

    move-result v0

    return v0
.end method

.method public final getBasicType()I
    .locals 1

    .line 308
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->type:Lcom/google/dexmaker/dx/rop/type/TypeBearer;

    invoke-interface {v0}, Lcom/google/dexmaker/dx/rop/type/TypeBearer;->getBasicType()I

    move-result v0

    return v0
.end method

.method public getCategory()I
    .locals 1

    .line 372
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->type:Lcom/google/dexmaker/dx/rop/type/TypeBearer;

    invoke-interface {v0}, Lcom/google/dexmaker/dx/rop/type/TypeBearer;->getType()Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/type/Type;->getCategory()I

    move-result v0

    return v0
.end method

.method public getFrameType()Lcom/google/dexmaker/dx/rop/type/TypeBearer;
    .locals 1

    .line 303
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->type:Lcom/google/dexmaker/dx/rop/type/TypeBearer;

    invoke-interface {v0}, Lcom/google/dexmaker/dx/rop/type/TypeBearer;->getFrameType()Lcom/google/dexmaker/dx/rop/type/TypeBearer;

    move-result-object v0

    return-object v0
.end method

.method public getLocalItem()Lcom/google/dexmaker/dx/rop/code/LocalItem;
    .locals 1

    .line 347
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->local:Lcom/google/dexmaker/dx/rop/code/LocalItem;

    return-object v0
.end method

.method public getNextReg()I
    .locals 2

    .line 360
    iget v0, p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->reg:I

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getCategory()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public getReg()I
    .locals 1

    .line 327
    iget v0, p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->reg:I

    return v0
.end method

.method public getType()Lcom/google/dexmaker/dx/rop/type/Type;
    .locals 1

    .line 298
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->type:Lcom/google/dexmaker/dx/rop/type/TypeBearer;

    invoke-interface {v0}, Lcom/google/dexmaker/dx/rop/type/TypeBearer;->getType()Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object v0

    return-object v0
.end method

.method public getTypeBearer()Lcom/google/dexmaker/dx/rop/type/TypeBearer;
    .locals 1

    .line 337
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->type:Lcom/google/dexmaker/dx/rop/type/TypeBearer;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 266
    iget v0, p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->reg:I

    iget-object v1, p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->type:Lcom/google/dexmaker/dx/rop/type/TypeBearer;

    iget-object v2, p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->local:Lcom/google/dexmaker/dx/rop/code/LocalItem;

    invoke-static {v0, v1, v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->hashCodeOf(ILcom/google/dexmaker/dx/rop/type/TypeBearer;Lcom/google/dexmaker/dx/rop/code/LocalItem;)I

    move-result v0

    return v0
.end method

.method public intersect(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Z)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;
    .locals 4

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_a

    .line 442
    iget v1, p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->reg:I

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v2

    if-eq v1, v2, :cond_1

    goto :goto_4

    .line 446
    :cond_1
    iget-object v1, p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->local:Lcom/google/dexmaker/dx/rop/code/LocalItem;

    if-eqz v1, :cond_3

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getLocalItem()Lcom/google/dexmaker/dx/rop/code/LocalItem;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/dexmaker/dx/rop/code/LocalItem;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->local:Lcom/google/dexmaker/dx/rop/code/LocalItem;

    goto :goto_1

    :cond_3
    :goto_0
    move-object v1, v0

    .line 449
    :goto_1
    iget-object v2, p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->local:Lcom/google/dexmaker/dx/rop/code/LocalItem;

    if-ne v1, v2, :cond_4

    const/4 v2, 0x1

    goto :goto_2

    :cond_4
    const/4 v2, 0x0

    :goto_2
    if-eqz p2, :cond_5

    if-nez v2, :cond_5

    return-object v0

    .line 455
    :cond_5
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getType()Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object p2

    .line 456
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getType()Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object v3

    if-eq p2, v3, :cond_6

    return-object v0

    .line 463
    :cond_6
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->type:Lcom/google/dexmaker/dx/rop/type/TypeBearer;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getTypeBearer()Lcom/google/dexmaker/dx/rop/type/TypeBearer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    iget-object p2, p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->type:Lcom/google/dexmaker/dx/rop/type/TypeBearer;

    .line 466
    :cond_7
    iget-object p1, p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->type:Lcom/google/dexmaker/dx/rop/type/TypeBearer;

    if-ne p2, p1, :cond_8

    if-eqz v2, :cond_8

    return-object p0

    :cond_8
    if-nez v1, :cond_9

    .line 471
    iget p1, p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->reg:I

    invoke-static {p1, p2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->make(ILcom/google/dexmaker/dx/rop/type/TypeBearer;)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p1

    goto :goto_3

    :cond_9
    iget p1, p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->reg:I

    invoke-static {p1, p2, v1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->make(ILcom/google/dexmaker/dx/rop/type/TypeBearer;Lcom/google/dexmaker/dx/rop/code/LocalItem;)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p1

    :goto_3
    return-object p1

    :cond_a
    :goto_4
    return-object v0
.end method

.method public isCategory1()Z
    .locals 1

    .line 384
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->type:Lcom/google/dexmaker/dx/rop/type/TypeBearer;

    invoke-interface {v0}, Lcom/google/dexmaker/dx/rop/type/TypeBearer;->getType()Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/type/Type;->isCategory1()Z

    move-result v0

    return v0
.end method

.method public isCategory2()Z
    .locals 1

    .line 396
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->type:Lcom/google/dexmaker/dx/rop/type/TypeBearer;

    invoke-interface {v0}, Lcom/google/dexmaker/dx/rop/type/TypeBearer;->getType()Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/type/Type;->isCategory2()Z

    move-result v0

    return v0
.end method

.method public final isConstant()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public matchesVariable(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 212
    :cond_0
    iget-object v1, p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->type:Lcom/google/dexmaker/dx/rop/type/TypeBearer;

    invoke-interface {v1}, Lcom/google/dexmaker/dx/rop/type/TypeBearer;->getType()Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object v1

    iget-object v2, p1, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->type:Lcom/google/dexmaker/dx/rop/type/TypeBearer;

    invoke-interface {v2}, Lcom/google/dexmaker/dx/rop/type/TypeBearer;->getType()Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/dexmaker/dx/rop/type/Type;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->local:Lcom/google/dexmaker/dx/rop/code/LocalItem;

    iget-object p1, p1, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->local:Lcom/google/dexmaker/dx/rop/code/LocalItem;

    if-eq v1, p1, :cond_1

    if-eqz v1, :cond_2

    invoke-virtual {v1, p1}, Lcom/google/dexmaker/dx/rop/code/LocalItem;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    const/4 v0, 0x1

    :cond_2
    return v0
.end method

.method public regString()Ljava/lang/String;
    .locals 1

    .line 405
    iget v0, p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->reg:I

    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->regString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toHuman()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    .line 293
    invoke-direct {p0, v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->toString0(Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    .line 288
    invoke-direct {p0, v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->toString0(Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public withLocalItem(Lcom/google/dexmaker/dx/rop/code/LocalItem;)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;
    .locals 2

    .line 553
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->local:Lcom/google/dexmaker/dx/rop/code/LocalItem;

    if-eq v0, p1, :cond_1

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/google/dexmaker/dx/rop/code/LocalItem;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 559
    :cond_0
    iget v0, p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->reg:I

    iget-object v1, p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->type:Lcom/google/dexmaker/dx/rop/type/TypeBearer;

    invoke-static {v0, v1, p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->makeLocalOptional(ILcom/google/dexmaker/dx/rop/type/TypeBearer;Lcom/google/dexmaker/dx/rop/code/LocalItem;)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    return-object p0
.end method

.method public withOffset(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;
    .locals 1

    if-nez p1, :cond_0

    return-object p0

    .line 513
    :cond_0
    iget v0, p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->reg:I

    add-int/2addr v0, p1

    invoke-virtual {p0, v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->withReg(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p1

    return-object p1
.end method

.method public withReg(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;
    .locals 2

    .line 483
    iget v0, p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->reg:I

    if-ne v0, p1, :cond_0

    return-object p0

    .line 487
    :cond_0
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->type:Lcom/google/dexmaker/dx/rop/type/TypeBearer;

    iget-object v1, p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->local:Lcom/google/dexmaker/dx/rop/code/LocalItem;

    invoke-static {p1, v0, v1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->makeLocalOptional(ILcom/google/dexmaker/dx/rop/type/TypeBearer;Lcom/google/dexmaker/dx/rop/code/LocalItem;)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p1

    return-object p1
.end method

.method public withSimpleType()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;
    .locals 3

    .line 525
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->type:Lcom/google/dexmaker/dx/rop/type/TypeBearer;

    .line 528
    instance-of v1, v0, Lcom/google/dexmaker/dx/rop/type/Type;

    if-eqz v1, :cond_0

    .line 529
    move-object v1, v0

    check-cast v1, Lcom/google/dexmaker/dx/rop/type/Type;

    goto :goto_0

    .line 531
    :cond_0
    invoke-interface {v0}, Lcom/google/dexmaker/dx/rop/type/TypeBearer;->getType()Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object v1

    .line 534
    :goto_0
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/type/Type;->isUninitialized()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 535
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/type/Type;->getInitializedType()Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object v1

    :cond_1
    if-ne v1, v0, :cond_2

    return-object p0

    .line 542
    :cond_2
    iget v0, p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->reg:I

    iget-object v2, p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->local:Lcom/google/dexmaker/dx/rop/code/LocalItem;

    invoke-static {v0, v1, v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->makeLocalOptional(ILcom/google/dexmaker/dx/rop/type/TypeBearer;Lcom/google/dexmaker/dx/rop/code/LocalItem;)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v0

    return-object v0
.end method

.method public withType(Lcom/google/dexmaker/dx/rop/type/TypeBearer;)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;
    .locals 2

    .line 498
    iget v0, p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->reg:I

    iget-object v1, p0, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->local:Lcom/google/dexmaker/dx/rop/code/LocalItem;

    invoke-static {v0, p1, v1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->makeLocalOptional(ILcom/google/dexmaker/dx/rop/type/TypeBearer;Lcom/google/dexmaker/dx/rop/code/LocalItem;)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p1

    return-object p1
.end method
