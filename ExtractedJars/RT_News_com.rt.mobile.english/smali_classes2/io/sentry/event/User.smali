.class public Lio/sentry/event/User;
.super Ljava/lang/Object;
.source "User.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private final data:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final email:Ljava/lang/String;

.field private final id:Ljava/lang/String;

.field private final ipAddress:Ljava/lang/String;

.field private final username:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 46
    invoke-direct/range {v0 .. v5}, Lio/sentry/event/User;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lio/sentry/event/User;->id:Ljava/lang/String;

    .line 31
    iput-object p2, p0, Lio/sentry/event/User;->username:Ljava/lang/String;

    .line 32
    iput-object p3, p0, Lio/sentry/event/User;->ipAddress:Ljava/lang/String;

    .line 33
    iput-object p4, p0, Lio/sentry/event/User;->email:Ljava/lang/String;

    .line 34
    iput-object p5, p0, Lio/sentry/event/User;->data:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public getData()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 66
    iget-object v0, p0, Lio/sentry/event/User;->data:Ljava/util/Map;

    return-object v0
.end method

.method public getEmail()Ljava/lang/String;
    .locals 1

    .line 62
    iget-object v0, p0, Lio/sentry/event/User;->email:Ljava/lang/String;

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .line 50
    iget-object v0, p0, Lio/sentry/event/User;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getIpAddress()Ljava/lang/String;
    .locals 1

    .line 58
    iget-object v0, p0, Lio/sentry/event/User;->ipAddress:Ljava/lang/String;

    return-object v0
.end method

.method public getUsername()Ljava/lang/String;
    .locals 1

    .line 54
    iget-object v0, p0, Lio/sentry/event/User;->username:Ljava/lang/String;

    return-object v0
.end method
