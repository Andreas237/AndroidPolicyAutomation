.class public final Lorg/aspectj/runtime/reflect/Factory;
.super Ljava/lang/Object;
.source "Factory.java"


# static fields
.field private static NO_ARGS:[Ljava/lang/Object;

.field static synthetic class$java$lang$ClassNotFoundException:Ljava/lang/Class;

.field static prims:Ljava/util/Hashtable;


# instance fields
.field count:I

.field filename:Ljava/lang/String;

.field lexicalClass:Ljava/lang/Class;

.field lookupClassLoader:Ljava/lang/ClassLoader;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 42
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    sput-object v0, Lorg/aspectj/runtime/reflect/Factory;->prims:Ljava/util/Hashtable;

    .line 44
    sget-object v0, Lorg/aspectj/runtime/reflect/Factory;->prims:Ljava/util/Hashtable;

    const-string v1, "void"

    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    sget-object v0, Lorg/aspectj/runtime/reflect/Factory;->prims:Ljava/util/Hashtable;

    const-string v1, "boolean"

    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    sget-object v0, Lorg/aspectj/runtime/reflect/Factory;->prims:Ljava/util/Hashtable;

    const-string v1, "byte"

    sget-object v2, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    sget-object v0, Lorg/aspectj/runtime/reflect/Factory;->prims:Ljava/util/Hashtable;

    const-string v1, "char"

    sget-object v2, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    sget-object v0, Lorg/aspectj/runtime/reflect/Factory;->prims:Ljava/util/Hashtable;

    const-string v1, "short"

    sget-object v2, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    sget-object v0, Lorg/aspectj/runtime/reflect/Factory;->prims:Ljava/util/Hashtable;

    const-string v1, "int"

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    sget-object v0, Lorg/aspectj/runtime/reflect/Factory;->prims:Ljava/util/Hashtable;

    const-string v1, "long"

    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    sget-object v0, Lorg/aspectj/runtime/reflect/Factory;->prims:Ljava/util/Hashtable;

    const-string v1, "float"

    sget-object v2, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    sget-object v0, Lorg/aspectj/runtime/reflect/Factory;->prims:Ljava/util/Hashtable;

    const-string v1, "double"

    sget-object v2, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    .line 161
    new-array v0, v0, [Ljava/lang/Object;

    sput-object v0, Lorg/aspectj/runtime/reflect/Factory;->NO_ARGS:[Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Class;)V
    .locals 0

    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 81
    iput-object p1, p0, Lorg/aspectj/runtime/reflect/Factory;->filename:Ljava/lang/String;

    .line 82
    iput-object p2, p0, Lorg/aspectj/runtime/reflect/Factory;->lexicalClass:Ljava/lang/Class;

    const/4 p1, 0x0

    .line 83
    iput p1, p0, Lorg/aspectj/runtime/reflect/Factory;->count:I

    .line 84
    invoke-virtual {p2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    iput-object p1, p0, Lorg/aspectj/runtime/reflect/Factory;->lookupClassLoader:Ljava/lang/ClassLoader;

    return-void
.end method

.method static synthetic class$(Ljava/lang/String;)Ljava/lang/Class;
    .locals 1

    .line 75
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/NoClassDefFoundError;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NoClassDefFoundError;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method static makeClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;
    .locals 1

    const-string v0, "*"

    .line 56
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 58
    :cond_0
    sget-object v0, Lorg/aspectj/runtime/reflect/Factory;->prims:Ljava/util/Hashtable;

    invoke-virtual {v0, p0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    if-nez p1, :cond_2

    .line 66
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0

    return-object p0

    :cond_2
    const/4 v0, 0x0

    .line 70
    invoke-static {p0, v0, p1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    .line 75
    :catch_0
    sget-object p0, Lorg/aspectj/runtime/reflect/Factory;->class$java$lang$ClassNotFoundException:Ljava/lang/Class;

    if-nez p0, :cond_3

    const-string p0, "java.lang.ClassNotFoundException"

    invoke-static {p0}, Lorg/aspectj/runtime/reflect/Factory;->class$(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0

    sput-object p0, Lorg/aspectj/runtime/reflect/Factory;->class$java$lang$ClassNotFoundException:Ljava/lang/Class;

    :cond_3
    return-object p0
.end method

.method public static makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;
    .locals 2

    .line 164
    new-instance v0, Lorg/aspectj/runtime/reflect/JoinPointImpl;

    sget-object v1, Lorg/aspectj/runtime/reflect/Factory;->NO_ARGS:[Ljava/lang/Object;

    invoke-direct {v0, p0, p1, p2, v1}, Lorg/aspectj/runtime/reflect/JoinPointImpl;-><init>(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V

    return-object v0
.end method

.method public static makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;
    .locals 3

    .line 168
    new-instance v0, Lorg/aspectj/runtime/reflect/JoinPointImpl;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p3, v1, v2

    invoke-direct {v0, p0, p1, p2, v1}, Lorg/aspectj/runtime/reflect/JoinPointImpl;-><init>(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V

    return-object v0
.end method

.method public static makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;
    .locals 3

    .line 172
    new-instance v0, Lorg/aspectj/runtime/reflect/JoinPointImpl;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p3, v1, v2

    const/4 p3, 0x1

    aput-object p4, v1, p3

    invoke-direct {v0, p0, p1, p2, v1}, Lorg/aspectj/runtime/reflect/JoinPointImpl;-><init>(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;
    .locals 11

    move-object v0, p0

    const/16 v1, 0x10

    move-object v2, p1

    .line 187
    invoke-static {p1, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v3

    .line 189
    iget-object v1, v0, Lorg/aspectj/runtime/reflect/Factory;->lookupClassLoader:Ljava/lang/ClassLoader;

    move-object v2, p3

    invoke-static {p3, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v5

    .line 191
    new-instance v1, Ljava/util/StringTokenizer;

    const-string v2, ":"

    move-object v4, p4

    invoke-direct {v1, p4, v2}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 192
    invoke-virtual {v1}, Ljava/util/StringTokenizer;->countTokens()I

    move-result v2

    .line 193
    new-array v6, v2, [Ljava/lang/Class;

    const/4 v4, 0x0

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v2, :cond_0

    .line 195
    invoke-virtual {v1}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object v8

    iget-object v9, v0, Lorg/aspectj/runtime/reflect/Factory;->lookupClassLoader:Ljava/lang/ClassLoader;

    invoke-static {v8, v9}, Lorg/aspectj/runtime/reflect/Factory;->makeClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v8

    aput-object v8, v6, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 197
    :cond_0
    new-instance v1, Ljava/util/StringTokenizer;

    const-string v2, ":"

    move-object/from16 v7, p5

    invoke-direct {v1, v7, v2}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 198
    invoke-virtual {v1}, Ljava/util/StringTokenizer;->countTokens()I

    move-result v2

    .line 199
    new-array v7, v2, [Ljava/lang/String;

    const/4 v8, 0x0

    :goto_1
    if-ge v8, v2, :cond_1

    .line 201
    invoke-virtual {v1}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object v9

    aput-object v9, v7, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 203
    :cond_1
    new-instance v1, Ljava/util/StringTokenizer;

    const-string v2, ":"

    move-object/from16 v8, p6

    invoke-direct {v1, v8, v2}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 204
    invoke-virtual {v1}, Ljava/util/StringTokenizer;->countTokens()I

    move-result v2

    .line 205
    new-array v8, v2, [Ljava/lang/Class;

    :goto_2
    if-ge v4, v2, :cond_2

    .line 207
    invoke-virtual {v1}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object v9

    iget-object v10, v0, Lorg/aspectj/runtime/reflect/Factory;->lookupClassLoader:Ljava/lang/ClassLoader;

    invoke-static {v9, v10}, Lorg/aspectj/runtime/reflect/Factory;->makeClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v9

    aput-object v9, v8, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 209
    :cond_2
    iget-object v1, v0, Lorg/aspectj/runtime/reflect/Factory;->lookupClassLoader:Ljava/lang/ClassLoader;

    move-object/from16 v2, p7

    invoke-static {v2, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v9

    .line 211
    new-instance v1, Lorg/aspectj/runtime/reflect/MethodSignatureImpl;

    move-object v2, v1

    move-object v4, p2

    invoke-direct/range {v2 .. v9}, Lorg/aspectj/runtime/reflect/MethodSignatureImpl;-><init>(ILjava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;[Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v1
.end method

.method public makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;
    .locals 3

    .line 126
    new-instance v0, Lorg/aspectj/runtime/reflect/JoinPointImpl$StaticPartImpl;

    iget v1, p0, Lorg/aspectj/runtime/reflect/Factory;->count:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lorg/aspectj/runtime/reflect/Factory;->count:I

    const/4 v2, -0x1

    invoke-virtual {p0, p3, v2}, Lorg/aspectj/runtime/reflect/Factory;->makeSourceLoc(II)Lorg/aspectj/lang/reflect/SourceLocation;

    move-result-object p3

    invoke-direct {v0, v1, p1, p2, p3}, Lorg/aspectj/runtime/reflect/JoinPointImpl$StaticPartImpl;-><init>(ILjava/lang/String;Lorg/aspectj/lang/Signature;Lorg/aspectj/lang/reflect/SourceLocation;)V

    return-object v0
.end method

.method public makeSourceLoc(II)Lorg/aspectj/lang/reflect/SourceLocation;
    .locals 2

    .line 424
    new-instance p2, Lorg/aspectj/runtime/reflect/SourceLocationImpl;

    iget-object v0, p0, Lorg/aspectj/runtime/reflect/Factory;->lexicalClass:Ljava/lang/Class;

    iget-object v1, p0, Lorg/aspectj/runtime/reflect/Factory;->filename:Ljava/lang/String;

    invoke-direct {p2, v0, v1, p1}, Lorg/aspectj/runtime/reflect/SourceLocationImpl;-><init>(Ljava/lang/Class;Ljava/lang/String;I)V

    return-object p2
.end method
