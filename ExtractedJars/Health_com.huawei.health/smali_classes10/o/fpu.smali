.class public Lo/fpu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/security/Principal;


# instance fields
.field private final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    if-nez p1, :cond_0

    .line 36
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Identity must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 38
    :cond_0
    iput-object p1, p0, Lo/fpu;->b:Ljava/lang/String;

    .line 40
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 76
    if-ne p0, p1, :cond_0

    .line 77
    const/4 v0, 0x1

    return v0

    .line 79
    :cond_0
    if-nez p1, :cond_1

    .line 80
    const/4 v0, 0x0

    return v0

    .line 82
    :cond_1
    instance-of v0, p1, Lo/fpu;

    if-nez v0, :cond_2

    .line 83
    const/4 v0, 0x0

    return v0

    .line 85
    :cond_2
    move-object v2, p1

    check-cast v2, Lo/fpu;

    .line 86
    iget-object v0, p0, Lo/fpu;->b:Ljava/lang/String;

    if-nez v0, :cond_3

    .line 87
    iget-object v0, v2, Lo/fpu;->b:Ljava/lang/String;

    if-eqz v0, :cond_4

    .line 88
    const/4 v0, 0x0

    return v0

    .line 90
    :cond_3
    iget-object v0, p0, Lo/fpu;->b:Ljava/lang/String;

    iget-object v1, v2, Lo/fpu;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 91
    const/4 v0, 0x0

    return v0

    .line 93
    :cond_4
    const/4 v0, 0x1

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 49
    iget-object v0, p0, Lo/fpu;->b:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    .line 67
    const/16 v2, 0x1f

    .line 68
    const/4 v3, 0x1

    .line 69
    iget-object v0, p0, Lo/fpu;->b:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lo/fpu;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    add-int/lit8 v3, v0, 0x1f

    .line 71
    return v3
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 62
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "PreSharedKey Identity ["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lo/fpu;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
