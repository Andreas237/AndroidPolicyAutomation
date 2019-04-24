.class Lo/alw$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/alw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field b:[Ljava/lang/String;

.field d:Ljava/io/File;


# direct methods
.method public constructor <init>(Ljava/io/File;[Ljava/lang/String;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lo/alw$d;->d:Ljava/io/File;

    .line 26
    iput-object p2, p0, Lo/alw$d;->b:[Ljava/lang/String;

    .line 27
    return-void
.end method
