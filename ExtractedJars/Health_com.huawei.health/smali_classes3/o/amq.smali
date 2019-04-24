.class public Lo/amq;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:[Ljava/lang/String;

.field private static c:[Ljava/lang/String;

.field private static e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 11
    const-string v0, "Step_CfgFilePolicy"

    sput-object v0, Lo/amq;->e:Ljava/lang/String;

    .line 47
    const-string v0, "CUST_POLICY_DIRS"

    invoke-static {v0}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 48
    sget-object v0, Lo/amq;->e:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "policy="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    .line 50
    :cond_0
    sget-object v0, Lo/amq;->e:Ljava/lang/String;

    const-string v1, "ERROR: env CUST_POLICY_DIRS not set, use default"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 51
    const-string v4, "/system/emui:/system/global:/system/etc:/oem:/data/cust:/cust_spec"

    .line 53
    :cond_1
    const-string v0, ":"

    invoke-virtual {v4, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/amq;->c:[Ljava/lang/String;

    .line 54
    const-string v5, "/etc"

    .line 55
    sget-object v0, Lo/amq;->c:[Ljava/lang/String;

    invoke-virtual {v0}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    sput-object v0, Lo/amq;->b:[Ljava/lang/String;

    .line 56
    const/4 v6, 0x0

    :goto_0
    sget-object v0, Lo/amq;->b:[Ljava/lang/String;

    array-length v0, v0

    if-ge v6, v0, :cond_3

    .line 57
    sget-object v0, Lo/amq;->b:[Ljava/lang/String;

    aget-object v0, v0, v6

    invoke-virtual {v0, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lo/amq;->b:[Ljava/lang/String;

    aget-object v0, v0, v6

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 58
    sget-object v0, Lo/amq;->b:[Ljava/lang/String;

    sget-object v1, Lo/amq;->b:[Ljava/lang/String;

    aget-object v1, v1, v6

    const-string v2, ""

    invoke-virtual {v1, v5, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v6

    .line 56
    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 61
    :cond_3
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Ljava/lang/String;I)Ljava/io/File;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NoClassDefFoundError;
        }
    .end annotation

    .line 30
    sget-object v0, Lo/amq;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCfgFile enter..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 31
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    sget-object v4, Lo/amq;->b:[Ljava/lang/String;

    goto :goto_0

    :cond_0
    sget-object v4, Lo/amq;->c:[Ljava/lang/String;

    .line 32
    :goto_0
    array-length v0, v4

    add-int/lit8 v5, v0, -0x1

    :goto_1
    if-ltz v5, :cond_2

    .line 33
    new-instance v6, Ljava/io/File;

    aget-object v0, v4, v5

    invoke-direct {v6, v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 35
    return-object v6

    .line 32
    :cond_1
    add-int/lit8 v5, v5, -0x1

    goto :goto_1

    .line 38
    :cond_2
    sget-object v0, Lo/amq;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "No config file found for:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 39
    sget-object v0, Lo/amq;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "CFG_DIRS length : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lo/amq;->c:[Ljava/lang/String;

    array-length v3, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 40
    const/4 v0, 0x0

    return-object v0
.end method
