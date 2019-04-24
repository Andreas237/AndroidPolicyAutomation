.class public Lorg/apache/commons/io/monitor/FileEntry;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field static final EMPTY_ENTRIES:[Lorg/apache/commons/io/monitor/FileEntry;

.field private static final serialVersionUID:J = -0x22c5e8fed07c1d41L


# instance fields
.field private children:[Lorg/apache/commons/io/monitor/FileEntry;

.field private directory:Z

.field private exists:Z

.field private final file:Ljava/io/File;

.field private lastModified:J

.field private length:J

.field private name:Ljava/lang/String;

.field private final parent:Lorg/apache/commons/io/monitor/FileEntry;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 47
    const/4 v0, 0x0

    new-array v0, v0, [Lorg/apache/commons/io/monitor/FileEntry;

    sput-object v0, Lorg/apache/commons/io/monitor/FileEntry;->EMPTY_ENTRIES:[Lorg/apache/commons/io/monitor/FileEntry;

    return-void
.end method

.method public constructor <init>(Ljava/io/File;)V
    .locals 1

    .line 64
    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, Lorg/apache/commons/io/monitor/FileEntry;-><init>(Lorg/apache/commons/io/monitor/FileEntry;Ljava/io/File;)V

    .line 65
    return-void
.end method

.method public constructor <init>(Lorg/apache/commons/io/monitor/FileEntry;Ljava/io/File;)V
    .locals 2

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    if-nez p2, :cond_0

    .line 75
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "File is missing"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 77
    :cond_0
    iput-object p2, p0, Lorg/apache/commons/io/monitor/FileEntry;->file:Ljava/io/File;

    .line 78
    iput-object p1, p0, Lorg/apache/commons/io/monitor/FileEntry;->parent:Lorg/apache/commons/io/monitor/FileEntry;

    .line 79
    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/commons/io/monitor/FileEntry;->name:Ljava/lang/String;

    .line 80
    return-void
.end method


# virtual methods
.method public getChildren()[Lorg/apache/commons/io/monitor/FileEntry;
    .locals 1

    .line 157
    iget-object v0, p0, Lorg/apache/commons/io/monitor/FileEntry;->children:[Lorg/apache/commons/io/monitor/FileEntry;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/apache/commons/io/monitor/FileEntry;->children:[Lorg/apache/commons/io/monitor/FileEntry;

    goto :goto_0

    :cond_0
    sget-object v0, Lorg/apache/commons/io/monitor/FileEntry;->EMPTY_ENTRIES:[Lorg/apache/commons/io/monitor/FileEntry;

    :goto_0
    return-object v0
.end method

.method public getFile()Ljava/io/File;
    .locals 1

    .line 175
    iget-object v0, p0, Lorg/apache/commons/io/monitor/FileEntry;->file:Ljava/io/File;

    return-object v0
.end method

.method public getLastModified()J
    .locals 2

    .line 203
    iget-wide v0, p0, Lorg/apache/commons/io/monitor/FileEntry;->lastModified:J

    return-wide v0
.end method

.method public getLength()J
    .locals 2

    .line 222
    iget-wide v0, p0, Lorg/apache/commons/io/monitor/FileEntry;->length:J

    return-wide v0
.end method

.method public getLevel()I
    .locals 2

    .line 146
    iget-object v0, p0, Lorg/apache/commons/io/monitor/FileEntry;->parent:Lorg/apache/commons/io/monitor/FileEntry;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lorg/apache/commons/io/monitor/FileEntry;->parent:Lorg/apache/commons/io/monitor/FileEntry;

    invoke-virtual {v0}, Lorg/apache/commons/io/monitor/FileEntry;->getLevel()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    :goto_0
    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 184
    iget-object v0, p0, Lorg/apache/commons/io/monitor/FileEntry;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getParent()Lorg/apache/commons/io/monitor/FileEntry;
    .locals 1

    .line 137
    iget-object v0, p0, Lorg/apache/commons/io/monitor/FileEntry;->parent:Lorg/apache/commons/io/monitor/FileEntry;

    return-object v0
.end method

.method public isDirectory()Z
    .locals 1

    .line 260
    iget-boolean v0, p0, Lorg/apache/commons/io/monitor/FileEntry;->directory:Z

    return v0
.end method

.method public isExists()Z
    .locals 1

    .line 241
    iget-boolean v0, p0, Lorg/apache/commons/io/monitor/FileEntry;->exists:Z

    return v0
.end method

.method public newChildInstance(Ljava/io/File;)Lorg/apache/commons/io/monitor/FileEntry;
    .locals 1

    .line 128
    new-instance v0, Lorg/apache/commons/io/monitor/FileEntry;

    invoke-direct {v0, p0, p1}, Lorg/apache/commons/io/monitor/FileEntry;-><init>(Lorg/apache/commons/io/monitor/FileEntry;Ljava/io/File;)V

    return-object v0
.end method

.method public refresh(Ljava/io/File;)Z
    .locals 8

    .line 99
    iget-boolean v2, p0, Lorg/apache/commons/io/monitor/FileEntry;->exists:Z

    .line 100
    iget-wide v3, p0, Lorg/apache/commons/io/monitor/FileEntry;->lastModified:J

    .line 101
    iget-boolean v5, p0, Lorg/apache/commons/io/monitor/FileEntry;->directory:Z

    .line 102
    iget-wide v6, p0, Lorg/apache/commons/io/monitor/FileEntry;->length:J

    .line 105
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/commons/io/monitor/FileEntry;->name:Ljava/lang/String;

    .line 106
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    iput-boolean v0, p0, Lorg/apache/commons/io/monitor/FileEntry;->exists:Z

    .line 107
    iget-boolean v0, p0, Lorg/apache/commons/io/monitor/FileEntry;->exists:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lorg/apache/commons/io/monitor/FileEntry;->directory:Z

    .line 108
    iget-boolean v0, p0, Lorg/apache/commons/io/monitor/FileEntry;->exists:Z

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ljava/io/File;->lastModified()J

    move-result-wide v0

    goto :goto_1

    :cond_1
    const-wide/16 v0, 0x0

    :goto_1
    iput-wide v0, p0, Lorg/apache/commons/io/monitor/FileEntry;->lastModified:J

    .line 109
    iget-boolean v0, p0, Lorg/apache/commons/io/monitor/FileEntry;->exists:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lorg/apache/commons/io/monitor/FileEntry;->directory:Z

    if-nez v0, :cond_2

    invoke-virtual {p1}, Ljava/io/File;->length()J

    move-result-wide v0

    goto :goto_2

    :cond_2
    const-wide/16 v0, 0x0

    :goto_2
    iput-wide v0, p0, Lorg/apache/commons/io/monitor/FileEntry;->length:J

    .line 112
    iget-boolean v0, p0, Lorg/apache/commons/io/monitor/FileEntry;->exists:Z

    if-ne v0, v2, :cond_3

    iget-wide v0, p0, Lorg/apache/commons/io/monitor/FileEntry;->lastModified:J

    cmp-long v0, v0, v3

    if-nez v0, :cond_3

    iget-boolean v0, p0, Lorg/apache/commons/io/monitor/FileEntry;->directory:Z

    if-ne v0, v5, :cond_3

    iget-wide v0, p0, Lorg/apache/commons/io/monitor/FileEntry;->length:J

    cmp-long v0, v0, v6

    if-eqz v0, :cond_4

    :cond_3
    const/4 v0, 0x1

    goto :goto_3

    :cond_4
    const/4 v0, 0x0

    :goto_3
    return v0
.end method

.method public setChildren([Lorg/apache/commons/io/monitor/FileEntry;)V
    .locals 0

    .line 166
    iput-object p1, p0, Lorg/apache/commons/io/monitor/FileEntry;->children:[Lorg/apache/commons/io/monitor/FileEntry;

    .line 167
    return-void
.end method

.method public setDirectory(Z)V
    .locals 0

    .line 269
    iput-boolean p1, p0, Lorg/apache/commons/io/monitor/FileEntry;->directory:Z

    .line 270
    return-void
.end method

.method public setExists(Z)V
    .locals 0

    .line 251
    iput-boolean p1, p0, Lorg/apache/commons/io/monitor/FileEntry;->exists:Z

    .line 252
    return-void
.end method

.method public setLastModified(J)V
    .locals 0

    .line 213
    iput-wide p1, p0, Lorg/apache/commons/io/monitor/FileEntry;->lastModified:J

    .line 214
    return-void
.end method

.method public setLength(J)V
    .locals 0

    .line 231
    iput-wide p1, p0, Lorg/apache/commons/io/monitor/FileEntry;->length:J

    .line 232
    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 193
    iput-object p1, p0, Lorg/apache/commons/io/monitor/FileEntry;->name:Ljava/lang/String;

    .line 194
    return-void
.end method
