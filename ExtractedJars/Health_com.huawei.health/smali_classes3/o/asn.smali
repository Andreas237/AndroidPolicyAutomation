.class public Lo/asn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private a:J

.field private c:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    return-void
.end method

.method public constructor <init>(JLjava/lang/String;)V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-wide p1, p0, Lo/asn;->a:J

    .line 37
    iput-object p3, p0, Lo/asn;->c:Ljava/lang/String;

    .line 38
    return-void
.end method


# virtual methods
.method public b()J
    .locals 2

    .line 43
    iget-wide v0, p0, Lo/asn;->a:J

    .line 44
    return-wide v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 60
    iput-object p1, p0, Lo/asn;->c:Ljava/lang/String;

    .line 61
    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 54
    iget-object v0, p0, Lo/asn;->c:Ljava/lang/String;

    .line 55
    return-object v0
.end method
