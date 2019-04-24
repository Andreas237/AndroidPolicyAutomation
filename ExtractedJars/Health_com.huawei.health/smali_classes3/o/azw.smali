.class final Lo/azw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/jivesoftware/smack/android/SmackLoggerFactory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/azw$c;
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public create()Lorg/jivesoftware/smack/android/SmackLogger;
    .locals 2

    .line 46
    new-instance v0, Lo/azw$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/azw$c;-><init>(Lo/azw$3;)V

    return-object v0
.end method
