.class public final Lorg/apache/commons/cli/OptionBuilder;
.super Ljava/lang/Object;
.source "OptionBuilder.java"


# static fields
.field private static argName:Ljava/lang/String; = null

.field private static description:Ljava/lang/String; = null

.field private static instance:Lorg/apache/commons/cli/OptionBuilder; = null

.field private static longopt:Ljava/lang/String; = null

.field private static numberOfArgs:I = -0x1

.field private static optionalArg:Z

.field private static required:Z

.field private static type:Ljava/lang/Object;

.field private static valuesep:C


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 58
    new-instance v0, Lorg/apache/commons/cli/OptionBuilder;

    invoke-direct {v0}, Lorg/apache/commons/cli/OptionBuilder;-><init>()V

    sput-object v0, Lorg/apache/commons/cli/OptionBuilder;->instance:Lorg/apache/commons/cli/OptionBuilder;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create()Lorg/apache/commons/cli/Option;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 327
    sget-object v0, Lorg/apache/commons/cli/OptionBuilder;->longopt:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 333
    invoke-static {v0}, Lorg/apache/commons/cli/OptionBuilder;->create(Ljava/lang/String;)Lorg/apache/commons/cli/Option;

    move-result-object v0

    return-object v0

    .line 329
    :cond_0
    invoke-static {}, Lorg/apache/commons/cli/OptionBuilder;->reset()V

    .line 330
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "must specify longopt"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static create(C)Lorg/apache/commons/cli/Option;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 316
    invoke-static {p0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lorg/apache/commons/cli/OptionBuilder;->create(Ljava/lang/String;)Lorg/apache/commons/cli/Option;

    move-result-object p0

    return-object p0
.end method

.method public static create(Ljava/lang/String;)Lorg/apache/commons/cli/Option;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 351
    :try_start_0
    new-instance v0, Lorg/apache/commons/cli/Option;

    sget-object v1, Lorg/apache/commons/cli/OptionBuilder;->description:Ljava/lang/String;

    invoke-direct {v0, p0, v1}, Lorg/apache/commons/cli/Option;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 354
    sget-object p0, Lorg/apache/commons/cli/OptionBuilder;->longopt:Ljava/lang/String;

    invoke-virtual {v0, p0}, Lorg/apache/commons/cli/Option;->setLongOpt(Ljava/lang/String;)V

    .line 355
    sget-boolean p0, Lorg/apache/commons/cli/OptionBuilder;->required:Z

    invoke-virtual {v0, p0}, Lorg/apache/commons/cli/Option;->setRequired(Z)V

    .line 356
    sget-boolean p0, Lorg/apache/commons/cli/OptionBuilder;->optionalArg:Z

    invoke-virtual {v0, p0}, Lorg/apache/commons/cli/Option;->setOptionalArg(Z)V

    .line 357
    sget p0, Lorg/apache/commons/cli/OptionBuilder;->numberOfArgs:I

    invoke-virtual {v0, p0}, Lorg/apache/commons/cli/Option;->setArgs(I)V

    .line 358
    sget-object p0, Lorg/apache/commons/cli/OptionBuilder;->type:Ljava/lang/Object;

    invoke-virtual {v0, p0}, Lorg/apache/commons/cli/Option;->setType(Ljava/lang/Object;)V

    .line 359
    sget-char p0, Lorg/apache/commons/cli/OptionBuilder;->valuesep:C

    invoke-virtual {v0, p0}, Lorg/apache/commons/cli/Option;->setValueSeparator(C)V

    .line 360
    sget-object p0, Lorg/apache/commons/cli/OptionBuilder;->argName:Ljava/lang/String;

    invoke-virtual {v0, p0}, Lorg/apache/commons/cli/Option;->setArgName(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 363
    invoke-static {}, Lorg/apache/commons/cli/OptionBuilder;->reset()V

    return-object v0

    :catchall_0
    move-exception p0

    invoke-static {}, Lorg/apache/commons/cli/OptionBuilder;->reset()V

    throw p0
.end method

.method public static hasArg()Lorg/apache/commons/cli/OptionBuilder;
    .locals 1

    const/4 v0, 0x1

    .line 106
    sput v0, Lorg/apache/commons/cli/OptionBuilder;->numberOfArgs:I

    .line 108
    sget-object v0, Lorg/apache/commons/cli/OptionBuilder;->instance:Lorg/apache/commons/cli/OptionBuilder;

    return-object v0
.end method

.method public static hasArg(Z)Lorg/apache/commons/cli/OptionBuilder;
    .locals 0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, -0x1

    .line 120
    :goto_0
    sput p0, Lorg/apache/commons/cli/OptionBuilder;->numberOfArgs:I

    .line 122
    sget-object p0, Lorg/apache/commons/cli/OptionBuilder;->instance:Lorg/apache/commons/cli/OptionBuilder;

    return-object p0
.end method

.method public static hasArgs()Lorg/apache/commons/cli/OptionBuilder;
    .locals 1

    const/4 v0, -0x2

    .line 219
    sput v0, Lorg/apache/commons/cli/OptionBuilder;->numberOfArgs:I

    .line 221
    sget-object v0, Lorg/apache/commons/cli/OptionBuilder;->instance:Lorg/apache/commons/cli/OptionBuilder;

    return-object v0
.end method

.method public static hasArgs(I)Lorg/apache/commons/cli/OptionBuilder;
    .locals 0

    .line 232
    sput p0, Lorg/apache/commons/cli/OptionBuilder;->numberOfArgs:I

    .line 234
    sget-object p0, Lorg/apache/commons/cli/OptionBuilder;->instance:Lorg/apache/commons/cli/OptionBuilder;

    return-object p0
.end method

.method public static hasOptionalArg()Lorg/apache/commons/cli/OptionBuilder;
    .locals 1

    const/4 v0, 0x1

    .line 244
    sput v0, Lorg/apache/commons/cli/OptionBuilder;->numberOfArgs:I

    .line 245
    sput-boolean v0, Lorg/apache/commons/cli/OptionBuilder;->optionalArg:Z

    .line 247
    sget-object v0, Lorg/apache/commons/cli/OptionBuilder;->instance:Lorg/apache/commons/cli/OptionBuilder;

    return-object v0
.end method

.method public static hasOptionalArgs()Lorg/apache/commons/cli/OptionBuilder;
    .locals 1

    const/4 v0, -0x2

    .line 257
    sput v0, Lorg/apache/commons/cli/OptionBuilder;->numberOfArgs:I

    const/4 v0, 0x1

    .line 258
    sput-boolean v0, Lorg/apache/commons/cli/OptionBuilder;->optionalArg:Z

    .line 260
    sget-object v0, Lorg/apache/commons/cli/OptionBuilder;->instance:Lorg/apache/commons/cli/OptionBuilder;

    return-object v0
.end method

.method public static hasOptionalArgs(I)Lorg/apache/commons/cli/OptionBuilder;
    .locals 0

    .line 272
    sput p0, Lorg/apache/commons/cli/OptionBuilder;->numberOfArgs:I

    const/4 p0, 0x1

    .line 273
    sput-boolean p0, Lorg/apache/commons/cli/OptionBuilder;->optionalArg:Z

    .line 275
    sget-object p0, Lorg/apache/commons/cli/OptionBuilder;->instance:Lorg/apache/commons/cli/OptionBuilder;

    return-object p0
.end method

.method public static isRequired()Lorg/apache/commons/cli/OptionBuilder;
    .locals 1

    const/4 v0, 0x1

    .line 145
    sput-boolean v0, Lorg/apache/commons/cli/OptionBuilder;->required:Z

    .line 147
    sget-object v0, Lorg/apache/commons/cli/OptionBuilder;->instance:Lorg/apache/commons/cli/OptionBuilder;

    return-object v0
.end method

.method public static isRequired(Z)Lorg/apache/commons/cli/OptionBuilder;
    .locals 0

    .line 207
    sput-boolean p0, Lorg/apache/commons/cli/OptionBuilder;->required:Z

    .line 209
    sget-object p0, Lorg/apache/commons/cli/OptionBuilder;->instance:Lorg/apache/commons/cli/OptionBuilder;

    return-object p0
.end method

.method private static reset()V
    .locals 2

    const/4 v0, 0x0

    .line 73
    sput-object v0, Lorg/apache/commons/cli/OptionBuilder;->description:Ljava/lang/String;

    const-string v1, "arg"

    .line 74
    sput-object v1, Lorg/apache/commons/cli/OptionBuilder;->argName:Ljava/lang/String;

    .line 75
    sput-object v0, Lorg/apache/commons/cli/OptionBuilder;->longopt:Ljava/lang/String;

    .line 76
    sput-object v0, Lorg/apache/commons/cli/OptionBuilder;->type:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 77
    sput-boolean v0, Lorg/apache/commons/cli/OptionBuilder;->required:Z

    const/4 v1, -0x1

    .line 78
    sput v1, Lorg/apache/commons/cli/OptionBuilder;->numberOfArgs:I

    .line 82
    sput-boolean v0, Lorg/apache/commons/cli/OptionBuilder;->optionalArg:Z

    .line 83
    sput-char v0, Lorg/apache/commons/cli/OptionBuilder;->valuesep:C

    return-void
.end method

.method public static withArgName(Ljava/lang/String;)Lorg/apache/commons/cli/OptionBuilder;
    .locals 0

    .line 133
    sput-object p0, Lorg/apache/commons/cli/OptionBuilder;->argName:Ljava/lang/String;

    .line 135
    sget-object p0, Lorg/apache/commons/cli/OptionBuilder;->instance:Lorg/apache/commons/cli/OptionBuilder;

    return-object p0
.end method

.method public static withDescription(Ljava/lang/String;)Lorg/apache/commons/cli/OptionBuilder;
    .locals 0

    .line 300
    sput-object p0, Lorg/apache/commons/cli/OptionBuilder;->description:Ljava/lang/String;

    .line 302
    sget-object p0, Lorg/apache/commons/cli/OptionBuilder;->instance:Lorg/apache/commons/cli/OptionBuilder;

    return-object p0
.end method

.method public static withLongOpt(Ljava/lang/String;)Lorg/apache/commons/cli/OptionBuilder;
    .locals 0

    .line 94
    sput-object p0, Lorg/apache/commons/cli/OptionBuilder;->longopt:Ljava/lang/String;

    .line 96
    sget-object p0, Lorg/apache/commons/cli/OptionBuilder;->instance:Lorg/apache/commons/cli/OptionBuilder;

    return-object p0
.end method

.method public static withType(Ljava/lang/Object;)Lorg/apache/commons/cli/OptionBuilder;
    .locals 0

    .line 287
    sput-object p0, Lorg/apache/commons/cli/OptionBuilder;->type:Ljava/lang/Object;

    .line 289
    sget-object p0, Lorg/apache/commons/cli/OptionBuilder;->instance:Lorg/apache/commons/cli/OptionBuilder;

    return-object p0
.end method

.method public static withValueSeparator()Lorg/apache/commons/cli/OptionBuilder;
    .locals 1

    const/16 v0, 0x3d

    .line 193
    sput-char v0, Lorg/apache/commons/cli/OptionBuilder;->valuesep:C

    .line 195
    sget-object v0, Lorg/apache/commons/cli/OptionBuilder;->instance:Lorg/apache/commons/cli/OptionBuilder;

    return-object v0
.end method

.method public static withValueSeparator(C)Lorg/apache/commons/cli/OptionBuilder;
    .locals 0

    .line 170
    sput-char p0, Lorg/apache/commons/cli/OptionBuilder;->valuesep:C

    .line 172
    sget-object p0, Lorg/apache/commons/cli/OptionBuilder;->instance:Lorg/apache/commons/cli/OptionBuilder;

    return-object p0
.end method
