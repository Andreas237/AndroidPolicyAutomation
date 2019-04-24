.class public final Lorg/jivesoftware/smack/filter/EmptyToMatcher;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/jivesoftware/smack/filter/StanzaFilter;


# static fields
.field public static final INSTANCE:Lorg/jivesoftware/smack/filter/EmptyToMatcher;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 24
    new-instance v0, Lorg/jivesoftware/smack/filter/EmptyToMatcher;

    invoke-direct {v0}, Lorg/jivesoftware/smack/filter/EmptyToMatcher;-><init>()V

    sput-object v0, Lorg/jivesoftware/smack/filter/EmptyToMatcher;->INSTANCE:Lorg/jivesoftware/smack/filter/EmptyToMatcher;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    return-void
.end method


# virtual methods
.method public accept(Lorg/jivesoftware/smack/packet/Stanza;)Z
    .locals 2

    .line 31
    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/Stanza;->getTo()Lo/fte;

    move-result-object v1

    .line 32
    if-nez v1, :cond_0

    .line 33
    const/4 v0, 0x1

    return v0

    .line 35
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 40
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
