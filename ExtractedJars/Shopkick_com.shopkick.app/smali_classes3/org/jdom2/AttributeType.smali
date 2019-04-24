.class public final enum Lorg/jdom2/AttributeType;
.super Ljava/lang/Enum;
.source "AttributeType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/jdom2/AttributeType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/jdom2/AttributeType;

.field public static final enum CDATA:Lorg/jdom2/AttributeType;

.field public static final enum ENTITIES:Lorg/jdom2/AttributeType;

.field public static final enum ENTITY:Lorg/jdom2/AttributeType;

.field public static final enum ENUMERATION:Lorg/jdom2/AttributeType;

.field public static final enum ID:Lorg/jdom2/AttributeType;

.field public static final enum IDREF:Lorg/jdom2/AttributeType;

.field public static final enum IDREFS:Lorg/jdom2/AttributeType;

.field public static final enum NMTOKEN:Lorg/jdom2/AttributeType;

.field public static final enum NMTOKENS:Lorg/jdom2/AttributeType;

.field public static final enum NOTATION:Lorg/jdom2/AttributeType;

.field public static final enum UNDECLARED:Lorg/jdom2/AttributeType;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 73
    new-instance v0, Lorg/jdom2/AttributeType;

    const-string v1, "UNDECLARED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/jdom2/AttributeType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jdom2/AttributeType;->UNDECLARED:Lorg/jdom2/AttributeType;

    .line 80
    new-instance v0, Lorg/jdom2/AttributeType;

    const-string v1, "CDATA"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lorg/jdom2/AttributeType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jdom2/AttributeType;->CDATA:Lorg/jdom2/AttributeType;

    .line 87
    new-instance v0, Lorg/jdom2/AttributeType;

    const-string v1, "ID"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lorg/jdom2/AttributeType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jdom2/AttributeType;->ID:Lorg/jdom2/AttributeType;

    .line 95
    new-instance v0, Lorg/jdom2/AttributeType;

    const-string v1, "IDREF"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lorg/jdom2/AttributeType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jdom2/AttributeType;->IDREF:Lorg/jdom2/AttributeType;

    .line 103
    new-instance v0, Lorg/jdom2/AttributeType;

    const-string v1, "IDREFS"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lorg/jdom2/AttributeType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jdom2/AttributeType;->IDREFS:Lorg/jdom2/AttributeType;

    .line 109
    new-instance v0, Lorg/jdom2/AttributeType;

    const-string v1, "ENTITY"

    const/4 v7, 0x5

    invoke-direct {v0, v1, v7}, Lorg/jdom2/AttributeType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jdom2/AttributeType;->ENTITY:Lorg/jdom2/AttributeType;

    .line 117
    new-instance v0, Lorg/jdom2/AttributeType;

    const-string v1, "ENTITIES"

    const/4 v8, 0x6

    invoke-direct {v0, v1, v8}, Lorg/jdom2/AttributeType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jdom2/AttributeType;->ENTITIES:Lorg/jdom2/AttributeType;

    .line 129
    new-instance v0, Lorg/jdom2/AttributeType;

    const-string v1, "NMTOKEN"

    const/4 v9, 0x7

    invoke-direct {v0, v1, v9}, Lorg/jdom2/AttributeType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jdom2/AttributeType;->NMTOKEN:Lorg/jdom2/AttributeType;

    .line 135
    new-instance v0, Lorg/jdom2/AttributeType;

    const-string v1, "NMTOKENS"

    const/16 v10, 0x8

    invoke-direct {v0, v1, v10}, Lorg/jdom2/AttributeType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jdom2/AttributeType;->NMTOKENS:Lorg/jdom2/AttributeType;

    .line 141
    new-instance v0, Lorg/jdom2/AttributeType;

    const-string v1, "NOTATION"

    const/16 v11, 0x9

    invoke-direct {v0, v1, v11}, Lorg/jdom2/AttributeType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jdom2/AttributeType;->NOTATION:Lorg/jdom2/AttributeType;

    .line 148
    new-instance v0, Lorg/jdom2/AttributeType;

    const-string v1, "ENUMERATION"

    const/16 v12, 0xa

    invoke-direct {v0, v1, v12}, Lorg/jdom2/AttributeType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jdom2/AttributeType;->ENUMERATION:Lorg/jdom2/AttributeType;

    const/16 v0, 0xb

    .line 65
    new-array v0, v0, [Lorg/jdom2/AttributeType;

    sget-object v1, Lorg/jdom2/AttributeType;->UNDECLARED:Lorg/jdom2/AttributeType;

    aput-object v1, v0, v2

    sget-object v1, Lorg/jdom2/AttributeType;->CDATA:Lorg/jdom2/AttributeType;

    aput-object v1, v0, v3

    sget-object v1, Lorg/jdom2/AttributeType;->ID:Lorg/jdom2/AttributeType;

    aput-object v1, v0, v4

    sget-object v1, Lorg/jdom2/AttributeType;->IDREF:Lorg/jdom2/AttributeType;

    aput-object v1, v0, v5

    sget-object v1, Lorg/jdom2/AttributeType;->IDREFS:Lorg/jdom2/AttributeType;

    aput-object v1, v0, v6

    sget-object v1, Lorg/jdom2/AttributeType;->ENTITY:Lorg/jdom2/AttributeType;

    aput-object v1, v0, v7

    sget-object v1, Lorg/jdom2/AttributeType;->ENTITIES:Lorg/jdom2/AttributeType;

    aput-object v1, v0, v8

    sget-object v1, Lorg/jdom2/AttributeType;->NMTOKEN:Lorg/jdom2/AttributeType;

    aput-object v1, v0, v9

    sget-object v1, Lorg/jdom2/AttributeType;->NMTOKENS:Lorg/jdom2/AttributeType;

    aput-object v1, v0, v10

    sget-object v1, Lorg/jdom2/AttributeType;->NOTATION:Lorg/jdom2/AttributeType;

    aput-object v1, v0, v11

    sget-object v1, Lorg/jdom2/AttributeType;->ENUMERATION:Lorg/jdom2/AttributeType;

    aput-object v1, v0, v12

    sput-object v0, Lorg/jdom2/AttributeType;->$VALUES:[Lorg/jdom2/AttributeType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 65
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static final byIndex(I)Lorg/jdom2/AttributeType;
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    if-ltz p0, :cond_1

    .line 164
    invoke-static {}, Lorg/jdom2/AttributeType;->values()[Lorg/jdom2/AttributeType;

    move-result-object v0

    array-length v0, v0

    if-ge p0, v0, :cond_0

    .line 168
    invoke-static {}, Lorg/jdom2/AttributeType;->values()[Lorg/jdom2/AttributeType;

    move-result-object v0

    aget-object p0, v0, p0

    return-object p0

    .line 165
    :cond_0
    new-instance v0, Lorg/jdom2/IllegalDataException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No such AttributeType "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ", max is "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lorg/jdom2/AttributeType;->values()[Lorg/jdom2/AttributeType;

    move-result-object p0

    array-length p0, p0

    add-int/lit8 p0, p0, -0x1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lorg/jdom2/IllegalDataException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 162
    :cond_1
    new-instance v0, Lorg/jdom2/IllegalDataException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No such AttributeType "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lorg/jdom2/IllegalDataException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final getAttributeType(Ljava/lang/String;)Lorg/jdom2/AttributeType;
    .locals 1

    if-nez p0, :cond_0

    .line 185
    sget-object p0, Lorg/jdom2/AttributeType;->UNDECLARED:Lorg/jdom2/AttributeType;

    return-object p0

    .line 189
    :cond_0
    :try_start_0
    invoke-static {p0}, Lorg/jdom2/AttributeType;->valueOf(Ljava/lang/String;)Lorg/jdom2/AttributeType;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    .line 191
    :catch_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result p0

    const/16 v0, 0x28

    if-ne p0, v0, :cond_1

    .line 196
    sget-object p0, Lorg/jdom2/AttributeType;->ENUMERATION:Lorg/jdom2/AttributeType;

    return-object p0

    .line 198
    :cond_1
    sget-object p0, Lorg/jdom2/AttributeType;->UNDECLARED:Lorg/jdom2/AttributeType;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/jdom2/AttributeType;
    .locals 1

    .line 65
    const-class v0, Lorg/jdom2/AttributeType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/jdom2/AttributeType;

    return-object p0
.end method

.method public static values()[Lorg/jdom2/AttributeType;
    .locals 1

    .line 65
    sget-object v0, Lorg/jdom2/AttributeType;->$VALUES:[Lorg/jdom2/AttributeType;

    invoke-virtual {v0}, [Lorg/jdom2/AttributeType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/jdom2/AttributeType;

    return-object v0
.end method
