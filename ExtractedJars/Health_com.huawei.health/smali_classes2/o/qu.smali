.class public abstract Lo/qu;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static d:Lo/qu;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 36
    new-instance v0, Lo/qq;

    invoke-direct {v0}, Lo/qq;-><init>()V

    sput-object v0, Lo/qu;->d:Lo/qu;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()Lo/qu;
    .locals 1

    .line 55
    sget-object v0, Lo/qu;->d:Lo/qu;

    return-object v0
.end method

.method protected static b(Lo/qr;[F)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 121
    invoke-virtual {p0}, Lo/qr;->a()I

    move-result v2

    .line 122
    invoke-virtual {p0}, Lo/qr;->h()I

    move-result v3

    .line 124
    const/4 v4, 0x1

    .line 125
    const/4 v5, 0x0

    :goto_0
    array-length v0, p1

    if-ge v5, v0, :cond_6

    if-eqz v4, :cond_6

    .line 126
    aget v0, p1, v5

    float-to-int v6, v0

    .line 127
    add-int/lit8 v0, v5, 0x1

    aget v0, p1, v0

    float-to-int v7, v0

    .line 128
    const/4 v0, -0x1

    if-lt v6, v0, :cond_0

    if-gt v6, v2, :cond_0

    const/4 v0, -0x1

    if-lt v7, v0, :cond_0

    if-le v7, v3, :cond_1

    .line 129
    :cond_0
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 131
    :cond_1
    const/4 v4, 0x0

    .line 132
    const/4 v0, -0x1

    if-ne v6, v0, :cond_2

    .line 133
    const/4 v0, 0x0

    aput v0, p1, v5

    .line 134
    const/4 v4, 0x1

    goto :goto_1

    .line 135
    :cond_2
    if-ne v6, v2, :cond_3

    .line 136
    add-int/lit8 v0, v2, -0x1

    int-to-float v0, v0

    aput v0, p1, v5

    .line 137
    const/4 v4, 0x1

    .line 139
    :cond_3
    :goto_1
    const/4 v0, -0x1

    if-ne v7, v0, :cond_4

    .line 140
    add-int/lit8 v0, v5, 0x1

    const/4 v1, 0x0

    aput v1, p1, v0

    .line 141
    const/4 v4, 0x1

    goto :goto_2

    .line 142
    :cond_4
    if-ne v7, v3, :cond_5

    .line 143
    add-int/lit8 v0, v5, 0x1

    add-int/lit8 v1, v3, -0x1

    int-to-float v1, v1

    aput v1, p1, v0

    .line 144
    const/4 v4, 0x1

    .line 125
    :cond_5
    :goto_2
    add-int/lit8 v5, v5, 0x2

    goto/16 :goto_0

    .line 148
    :cond_6
    const/4 v4, 0x1

    .line 149
    array-length v0, p1

    add-int/lit8 v5, v0, -0x2

    :goto_3
    if-ltz v5, :cond_d

    if-eqz v4, :cond_d

    .line 150
    aget v0, p1, v5

    float-to-int v6, v0

    .line 151
    add-int/lit8 v0, v5, 0x1

    aget v0, p1, v0

    float-to-int v7, v0

    .line 152
    const/4 v0, -0x1

    if-lt v6, v0, :cond_7

    if-gt v6, v2, :cond_7

    const/4 v0, -0x1

    if-lt v7, v0, :cond_7

    if-le v7, v3, :cond_8

    .line 153
    :cond_7
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 155
    :cond_8
    const/4 v4, 0x0

    .line 156
    const/4 v0, -0x1

    if-ne v6, v0, :cond_9

    .line 157
    const/4 v0, 0x0

    aput v0, p1, v5

    .line 158
    const/4 v4, 0x1

    goto :goto_4

    .line 159
    :cond_9
    if-ne v6, v2, :cond_a

    .line 160
    add-int/lit8 v0, v2, -0x1

    int-to-float v0, v0

    aput v0, p1, v5

    .line 161
    const/4 v4, 0x1

    .line 163
    :cond_a
    :goto_4
    const/4 v0, -0x1

    if-ne v7, v0, :cond_b

    .line 164
    add-int/lit8 v0, v5, 0x1

    const/4 v1, 0x0

    aput v1, p1, v0

    .line 165
    const/4 v4, 0x1

    goto :goto_5

    .line 166
    :cond_b
    if-ne v7, v3, :cond_c

    .line 167
    add-int/lit8 v0, v5, 0x1

    add-int/lit8 v1, v3, -0x1

    int-to-float v1, v1

    aput v1, p1, v0

    .line 168
    const/4 v4, 0x1

    .line 149
    :cond_c
    :goto_5
    add-int/lit8 v5, v5, -0x2

    goto/16 :goto_3

    .line 171
    :cond_d
    return-void
.end method


# virtual methods
.method public abstract d(Lo/qr;IIFFFFFFFFFFFFFFFF)Lo/qr;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation
.end method

.method public abstract d(Lo/qr;IILo/qv;)Lo/qr;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation
.end method
