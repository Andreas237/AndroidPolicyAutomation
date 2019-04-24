.class public final Lcom/google/dexmaker/dx/rop/cst/CstType;
.super Lcom/google/dexmaker/dx/rop/cst/TypedConstant;
.source "CstType.java"


# static fields
.field public static final BOOLEAN:Lcom/google/dexmaker/dx/rop/cst/CstType;

.field public static final BOOLEAN_ARRAY:Lcom/google/dexmaker/dx/rop/cst/CstType;

.field public static final BYTE:Lcom/google/dexmaker/dx/rop/cst/CstType;

.field public static final BYTE_ARRAY:Lcom/google/dexmaker/dx/rop/cst/CstType;

.field public static final CHARACTER:Lcom/google/dexmaker/dx/rop/cst/CstType;

.field public static final CHAR_ARRAY:Lcom/google/dexmaker/dx/rop/cst/CstType;

.field public static final DOUBLE:Lcom/google/dexmaker/dx/rop/cst/CstType;

.field public static final DOUBLE_ARRAY:Lcom/google/dexmaker/dx/rop/cst/CstType;

.field public static final FLOAT:Lcom/google/dexmaker/dx/rop/cst/CstType;

.field public static final FLOAT_ARRAY:Lcom/google/dexmaker/dx/rop/cst/CstType;

.field public static final INTEGER:Lcom/google/dexmaker/dx/rop/cst/CstType;

.field public static final INT_ARRAY:Lcom/google/dexmaker/dx/rop/cst/CstType;

.field public static final LONG:Lcom/google/dexmaker/dx/rop/cst/CstType;

.field public static final LONG_ARRAY:Lcom/google/dexmaker/dx/rop/cst/CstType;

.field public static final OBJECT:Lcom/google/dexmaker/dx/rop/cst/CstType;

.field public static final SHORT:Lcom/google/dexmaker/dx/rop/cst/CstType;

.field public static final SHORT_ARRAY:Lcom/google/dexmaker/dx/rop/cst/CstType;

.field public static final VOID:Lcom/google/dexmaker/dx/rop/cst/CstType;

.field private static final interns:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lcom/google/dexmaker/dx/rop/type/Type;",
            "Lcom/google/dexmaker/dx/rop/cst/CstType;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private descriptor:Lcom/google/dexmaker/dx/rop/cst/CstString;

.field private final type:Lcom/google/dexmaker/dx/rop/type/Type;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 28
    new-instance v0, Ljava/util/HashMap;

    const/16 v1, 0x64

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    sput-object v0, Lcom/google/dexmaker/dx/rop/cst/CstType;->interns:Ljava/util/HashMap;

    .line 32
    sget-object v0, Lcom/google/dexmaker/dx/rop/type/Type;->OBJECT:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/cst/CstType;->intern(Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/rop/cst/CstType;

    move-result-object v0

    sput-object v0, Lcom/google/dexmaker/dx/rop/cst/CstType;->OBJECT:Lcom/google/dexmaker/dx/rop/cst/CstType;

    .line 35
    sget-object v0, Lcom/google/dexmaker/dx/rop/type/Type;->BOOLEAN_CLASS:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/cst/CstType;->intern(Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/rop/cst/CstType;

    move-result-object v0

    sput-object v0, Lcom/google/dexmaker/dx/rop/cst/CstType;->BOOLEAN:Lcom/google/dexmaker/dx/rop/cst/CstType;

    .line 38
    sget-object v0, Lcom/google/dexmaker/dx/rop/type/Type;->BYTE_CLASS:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/cst/CstType;->intern(Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/rop/cst/CstType;

    move-result-object v0

    sput-object v0, Lcom/google/dexmaker/dx/rop/cst/CstType;->BYTE:Lcom/google/dexmaker/dx/rop/cst/CstType;

    .line 41
    sget-object v0, Lcom/google/dexmaker/dx/rop/type/Type;->CHARACTER_CLASS:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/cst/CstType;->intern(Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/rop/cst/CstType;

    move-result-object v0

    sput-object v0, Lcom/google/dexmaker/dx/rop/cst/CstType;->CHARACTER:Lcom/google/dexmaker/dx/rop/cst/CstType;

    .line 44
    sget-object v0, Lcom/google/dexmaker/dx/rop/type/Type;->DOUBLE_CLASS:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/cst/CstType;->intern(Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/rop/cst/CstType;

    move-result-object v0

    sput-object v0, Lcom/google/dexmaker/dx/rop/cst/CstType;->DOUBLE:Lcom/google/dexmaker/dx/rop/cst/CstType;

    .line 47
    sget-object v0, Lcom/google/dexmaker/dx/rop/type/Type;->FLOAT_CLASS:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/cst/CstType;->intern(Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/rop/cst/CstType;

    move-result-object v0

    sput-object v0, Lcom/google/dexmaker/dx/rop/cst/CstType;->FLOAT:Lcom/google/dexmaker/dx/rop/cst/CstType;

    .line 50
    sget-object v0, Lcom/google/dexmaker/dx/rop/type/Type;->LONG_CLASS:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/cst/CstType;->intern(Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/rop/cst/CstType;

    move-result-object v0

    sput-object v0, Lcom/google/dexmaker/dx/rop/cst/CstType;->LONG:Lcom/google/dexmaker/dx/rop/cst/CstType;

    .line 53
    sget-object v0, Lcom/google/dexmaker/dx/rop/type/Type;->INTEGER_CLASS:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/cst/CstType;->intern(Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/rop/cst/CstType;

    move-result-object v0

    sput-object v0, Lcom/google/dexmaker/dx/rop/cst/CstType;->INTEGER:Lcom/google/dexmaker/dx/rop/cst/CstType;

    .line 56
    sget-object v0, Lcom/google/dexmaker/dx/rop/type/Type;->SHORT_CLASS:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/cst/CstType;->intern(Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/rop/cst/CstType;

    move-result-object v0

    sput-object v0, Lcom/google/dexmaker/dx/rop/cst/CstType;->SHORT:Lcom/google/dexmaker/dx/rop/cst/CstType;

    .line 59
    sget-object v0, Lcom/google/dexmaker/dx/rop/type/Type;->VOID_CLASS:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/cst/CstType;->intern(Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/rop/cst/CstType;

    move-result-object v0

    sput-object v0, Lcom/google/dexmaker/dx/rop/cst/CstType;->VOID:Lcom/google/dexmaker/dx/rop/cst/CstType;

    .line 62
    sget-object v0, Lcom/google/dexmaker/dx/rop/type/Type;->BOOLEAN_ARRAY:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/cst/CstType;->intern(Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/rop/cst/CstType;

    move-result-object v0

    sput-object v0, Lcom/google/dexmaker/dx/rop/cst/CstType;->BOOLEAN_ARRAY:Lcom/google/dexmaker/dx/rop/cst/CstType;

    .line 65
    sget-object v0, Lcom/google/dexmaker/dx/rop/type/Type;->BYTE_ARRAY:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/cst/CstType;->intern(Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/rop/cst/CstType;

    move-result-object v0

    sput-object v0, Lcom/google/dexmaker/dx/rop/cst/CstType;->BYTE_ARRAY:Lcom/google/dexmaker/dx/rop/cst/CstType;

    .line 68
    sget-object v0, Lcom/google/dexmaker/dx/rop/type/Type;->CHAR_ARRAY:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/cst/CstType;->intern(Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/rop/cst/CstType;

    move-result-object v0

    sput-object v0, Lcom/google/dexmaker/dx/rop/cst/CstType;->CHAR_ARRAY:Lcom/google/dexmaker/dx/rop/cst/CstType;

    .line 71
    sget-object v0, Lcom/google/dexmaker/dx/rop/type/Type;->DOUBLE_ARRAY:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/cst/CstType;->intern(Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/rop/cst/CstType;

    move-result-object v0

    sput-object v0, Lcom/google/dexmaker/dx/rop/cst/CstType;->DOUBLE_ARRAY:Lcom/google/dexmaker/dx/rop/cst/CstType;

    .line 74
    sget-object v0, Lcom/google/dexmaker/dx/rop/type/Type;->FLOAT_ARRAY:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/cst/CstType;->intern(Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/rop/cst/CstType;

    move-result-object v0

    sput-object v0, Lcom/google/dexmaker/dx/rop/cst/CstType;->FLOAT_ARRAY:Lcom/google/dexmaker/dx/rop/cst/CstType;

    .line 77
    sget-object v0, Lcom/google/dexmaker/dx/rop/type/Type;->LONG_ARRAY:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/cst/CstType;->intern(Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/rop/cst/CstType;

    move-result-object v0

    sput-object v0, Lcom/google/dexmaker/dx/rop/cst/CstType;->LONG_ARRAY:Lcom/google/dexmaker/dx/rop/cst/CstType;

    .line 80
    sget-object v0, Lcom/google/dexmaker/dx/rop/type/Type;->INT_ARRAY:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/cst/CstType;->intern(Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/rop/cst/CstType;

    move-result-object v0

    sput-object v0, Lcom/google/dexmaker/dx/rop/cst/CstType;->INT_ARRAY:Lcom/google/dexmaker/dx/rop/cst/CstType;

    .line 83
    sget-object v0, Lcom/google/dexmaker/dx/rop/type/Type;->SHORT_ARRAY:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/cst/CstType;->intern(Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/rop/cst/CstType;

    move-result-object v0

    sput-object v0, Lcom/google/dexmaker/dx/rop/cst/CstType;->SHORT_ARRAY:Lcom/google/dexmaker/dx/rop/cst/CstType;

    return-void
.end method

.method public constructor <init>(Lcom/google/dexmaker/dx/rop/type/Type;)V
    .locals 1

    .line 143
    invoke-direct {p0}, Lcom/google/dexmaker/dx/rop/cst/TypedConstant;-><init>()V

    if-eqz p1, :cond_1

    .line 148
    sget-object v0, Lcom/google/dexmaker/dx/rop/type/Type;->KNOWN_NULL:Lcom/google/dexmaker/dx/rop/type/Type;

    if-eq p1, v0, :cond_0

    .line 153
    iput-object p1, p0, Lcom/google/dexmaker/dx/rop/cst/CstType;->type:Lcom/google/dexmaker/dx/rop/type/Type;

    const/4 p1, 0x0

    .line 154
    iput-object p1, p0, Lcom/google/dexmaker/dx/rop/cst/CstType;->descriptor:Lcom/google/dexmaker/dx/rop/cst/CstString;

    return-void

    .line 149
    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "KNOWN_NULL is not representable"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 145
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string/jumbo v0, "type == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static forBoxedPrimitiveType(Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/rop/cst/CstType;
    .locals 3

    .line 104
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/type/Type;->getBasicType()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 116
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "not primitive: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 112
    :pswitch_0
    sget-object p0, Lcom/google/dexmaker/dx/rop/cst/CstType;->SHORT:Lcom/google/dexmaker/dx/rop/cst/CstType;

    return-object p0

    .line 111
    :pswitch_1
    sget-object p0, Lcom/google/dexmaker/dx/rop/cst/CstType;->LONG:Lcom/google/dexmaker/dx/rop/cst/CstType;

    return-object p0

    .line 110
    :pswitch_2
    sget-object p0, Lcom/google/dexmaker/dx/rop/cst/CstType;->INTEGER:Lcom/google/dexmaker/dx/rop/cst/CstType;

    return-object p0

    .line 109
    :pswitch_3
    sget-object p0, Lcom/google/dexmaker/dx/rop/cst/CstType;->FLOAT:Lcom/google/dexmaker/dx/rop/cst/CstType;

    return-object p0

    .line 108
    :pswitch_4
    sget-object p0, Lcom/google/dexmaker/dx/rop/cst/CstType;->DOUBLE:Lcom/google/dexmaker/dx/rop/cst/CstType;

    return-object p0

    .line 107
    :pswitch_5
    sget-object p0, Lcom/google/dexmaker/dx/rop/cst/CstType;->CHARACTER:Lcom/google/dexmaker/dx/rop/cst/CstType;

    return-object p0

    .line 106
    :pswitch_6
    sget-object p0, Lcom/google/dexmaker/dx/rop/cst/CstType;->BYTE:Lcom/google/dexmaker/dx/rop/cst/CstType;

    return-object p0

    .line 105
    :pswitch_7
    sget-object p0, Lcom/google/dexmaker/dx/rop/cst/CstType;->BOOLEAN:Lcom/google/dexmaker/dx/rop/cst/CstType;

    return-object p0

    .line 113
    :pswitch_8
    sget-object p0, Lcom/google/dexmaker/dx/rop/cst/CstType;->VOID:Lcom/google/dexmaker/dx/rop/cst/CstType;

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static intern(Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/rop/cst/CstType;
    .locals 3

    .line 126
    sget-object v0, Lcom/google/dexmaker/dx/rop/cst/CstType;->interns:Ljava/util/HashMap;

    monitor-enter v0

    .line 127
    :try_start_0
    sget-object v1, Lcom/google/dexmaker/dx/rop/cst/CstType;->interns:Ljava/util/HashMap;

    invoke-virtual {v1, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/dexmaker/dx/rop/cst/CstType;

    if-nez v1, :cond_0

    .line 130
    new-instance v1, Lcom/google/dexmaker/dx/rop/cst/CstType;

    invoke-direct {v1, p0}, Lcom/google/dexmaker/dx/rop/cst/CstType;-><init>(Lcom/google/dexmaker/dx/rop/type/Type;)V

    .line 131
    sget-object v2, Lcom/google/dexmaker/dx/rop/cst/CstType;->interns:Ljava/util/HashMap;

    invoke-virtual {v2, p0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    :cond_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p0

    .line 135
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method


# virtual methods
.method protected compareTo0(Lcom/google/dexmaker/dx/rop/cst/Constant;)I
    .locals 1

    .line 176
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/cst/CstType;->type:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/type/Type;->getDescriptor()Ljava/lang/String;

    move-result-object v0

    .line 177
    check-cast p1, Lcom/google/dexmaker/dx/rop/cst/CstType;

    iget-object p1, p1, Lcom/google/dexmaker/dx/rop/cst/CstType;->type:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/type/Type;->getDescriptor()Ljava/lang/String;

    move-result-object p1

    .line 178
    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 160
    instance-of v0, p1, Lcom/google/dexmaker/dx/rop/cst/CstType;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 164
    :cond_0
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/cst/CstType;->type:Lcom/google/dexmaker/dx/rop/type/Type;

    check-cast p1, Lcom/google/dexmaker/dx/rop/cst/CstType;

    iget-object p1, p1, Lcom/google/dexmaker/dx/rop/cst/CstType;->type:Lcom/google/dexmaker/dx/rop/type/Type;

    if-ne v0, p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public getClassType()Lcom/google/dexmaker/dx/rop/type/Type;
    .locals 1

    .line 217
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/cst/CstType;->type:Lcom/google/dexmaker/dx/rop/type/Type;

    return-object v0
.end method

.method public getDescriptor()Lcom/google/dexmaker/dx/rop/cst/CstString;
    .locals 2

    .line 226
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/cst/CstType;->descriptor:Lcom/google/dexmaker/dx/rop/cst/CstString;

    if-nez v0, :cond_0

    .line 227
    new-instance v0, Lcom/google/dexmaker/dx/rop/cst/CstString;

    iget-object v1, p0, Lcom/google/dexmaker/dx/rop/cst/CstType;->type:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/type/Type;->getDescriptor()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/dexmaker/dx/rop/cst/CstString;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/dexmaker/dx/rop/cst/CstType;->descriptor:Lcom/google/dexmaker/dx/rop/cst/CstString;

    .line 230
    :cond_0
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/cst/CstType;->descriptor:Lcom/google/dexmaker/dx/rop/cst/CstString;

    return-object v0
.end method

.method public getType()Lcom/google/dexmaker/dx/rop/type/Type;
    .locals 1

    .line 189
    sget-object v0, Lcom/google/dexmaker/dx/rop/type/Type;->CLASS:Lcom/google/dexmaker/dx/rop/type/Type;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 170
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/cst/CstType;->type:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/type/Type;->hashCode()I

    move-result v0

    return v0
.end method

.method public isCategory2()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public toHuman()Ljava/lang/String;
    .locals 1

    .line 206
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/cst/CstType;->type:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/type/Type;->toHuman()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 184
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "type{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/cst/CstType;->toHuman()Ljava/lang/String;

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

    const-string/jumbo v0, "type"

    return-object v0
.end method
