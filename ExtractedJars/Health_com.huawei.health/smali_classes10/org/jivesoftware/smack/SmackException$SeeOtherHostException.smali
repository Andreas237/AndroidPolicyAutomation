.class public Lorg/jivesoftware/smack/SmackException$SeeOtherHostException;
.super Lorg/jivesoftware/smack/SmackException;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jivesoftware/smack/SmackException;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SeeOtherHostException"
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x46ef669b0349cf80L


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 302
    const-string v0, "reciever a see_other_host error."

    invoke-direct {p0, v0}, Lorg/jivesoftware/smack/SmackException;-><init>(Ljava/lang/String;)V

    .line 303
    return-void
.end method
