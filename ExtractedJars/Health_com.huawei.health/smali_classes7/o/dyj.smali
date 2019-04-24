.class public Lo/dyj;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lo/dvm;I)Lo/dzd;
    .locals 4

    .line 149
    new-instance v1, Lo/dzd;

    invoke-direct {v1}, Lo/dzd;-><init>()V

    .line 150
    invoke-virtual {p0}, Lo/dvm;->d()I

    move-result v2

    .line 151
    invoke-virtual {p0}, Lo/dvm;->b()I

    move-result v0

    invoke-static {v0, p1}, Lo/dzt;->c(II)I

    move-result v3

    .line 153
    invoke-static {v2}, Lo/dzt;->a(I)I

    move-result v0

    invoke-virtual {v1, v0}, Lo/dzd;->d(I)V

    .line 154
    invoke-virtual {v1, v2}, Lo/dzd;->b(I)V

    .line 155
    invoke-virtual {v1, v3}, Lo/dzd;->e(I)V

    .line 156
    return-object v1
.end method

.method public static a(D)Lo/dzj;
    .locals 6

    .line 109
    new-instance v1, Lo/dzj;

    invoke-direct {v1}, Lo/dzj;-><init>()V

    .line 110
    invoke-static {p0, p1}, Lo/dzt;->c(D)I

    move-result v2

    .line 111
    invoke-virtual {v1, v2}, Lo/dzj;->d(I)V

    .line 112
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lo/dzj;->c(I)V

    .line 113
    add-int/lit8 v0, v2, 0x1

    invoke-static {v0}, Lo/dzt;->a(I)I

    move-result v3

    .line 114
    invoke-static {v2}, Lo/dzt;->a(I)I

    move-result v4

    .line 115
    invoke-static {p0, p1}, Lo/dzt;->e(D)I

    move-result v5

    .line 117
    sub-int v0, v3, v4

    invoke-virtual {v1, v0}, Lo/dzj;->b(I)V

    .line 118
    sub-int v0, v5, v4

    invoke-virtual {v1, v0}, Lo/dzj;->e(I)V

    .line 119
    return-object v1
.end method

.method public static b(I)Lo/dzd;
    .locals 2

    .line 45
    new-instance v1, Lo/dzd;

    invoke-direct {v1}, Lo/dzd;-><init>()V

    .line 46
    invoke-static {p0}, Lo/dzt;->a(I)I

    move-result v0

    invoke-virtual {v1, v0}, Lo/dzd;->d(I)V

    .line 47
    invoke-virtual {v1, p0}, Lo/dzd;->b(I)V

    .line 48
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lo/dzd;->e(I)V

    .line 49
    return-object v1
.end method

.method public static c(D)Lo/dzc;
    .locals 4

    .line 31
    new-instance v1, Lo/dzc;

    invoke-direct {v1}, Lo/dzc;-><init>()V

    .line 32
    invoke-static {p0, p1}, Lo/dyj;->a(D)Lo/dzj;

    move-result-object v0

    invoke-virtual {v1, v0}, Lo/dzc;->b(Lo/dzj;)V

    .line 33
    new-instance v2, Ljava/util/ArrayList;

    const/16 v0, 0x14

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 34
    const/4 v3, 0x1

    :goto_0
    const/16 v0, 0x14

    if-gt v3, v0, :cond_0

    .line 35
    invoke-static {v3}, Lo/dyj;->b(I)Lo/dzd;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 37
    :cond_0
    invoke-virtual {v1, v2}, Lo/dzc;->b(Ljava/util/ArrayList;)V

    .line 38
    return-object v1
.end method

.method public static c(Lo/dze;)Lo/dzc;
    .locals 14

    .line 60
    const/4 v2, 0x0

    .line 61
    invoke-virtual {p0}, Lo/dze;->d()Lo/dvf;

    move-result-object v3

    .line 62
    instance-of v0, v3, Lo/dvj;

    if-eqz v0, :cond_0

    .line 63
    move-object v2, v3

    check-cast v2, Lo/dvj;

    .line 65
    :cond_0
    invoke-virtual {p0}, Lo/dze;->a()Ljava/util/List;

    move-result-object v4

    .line 66
    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    .line 67
    const/4 v0, 0x0

    return-object v0

    .line 69
    :cond_1
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 70
    const/4 v6, 0x0

    :goto_0
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_3

    .line 71
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/dvf;

    .line 72
    instance-of v0, v7, Lo/dvm;

    if-eqz v0, :cond_2

    .line 73
    move-object v0, v7

    check-cast v0, Lo/dvm;

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 70
    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 76
    :cond_3
    const/4 v0, 0x0

    if-ne v0, v2, :cond_4

    .line 77
    const/4 v0, 0x0

    return-object v0

    .line 79
    :cond_4
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    .line 80
    invoke-virtual {v2}, Lo/dvj;->d()I

    move-result v7

    .line 81
    new-instance v8, Lo/dzc;

    invoke-direct {v8}, Lo/dzc;-><init>()V

    .line 82
    new-instance v9, Ljava/util/ArrayList;

    const/16 v0, 0x14

    invoke-direct {v9, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 83
    const/4 v10, 0x1

    .line 84
    const/4 v11, 0x0

    .line 85
    const/4 v12, 0x0

    :goto_1
    if-ge v12, v6, :cond_6

    .line 86
    invoke-interface {v5, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lo/dvm;

    .line 87
    invoke-virtual {v13}, Lo/dvm;->b()I

    move-result v0

    add-int/2addr v11, v0

    .line 88
    add-int/lit8 v0, v12, 0x1

    if-ne v0, v7, :cond_5

    .line 89
    invoke-virtual {v13}, Lo/dvm;->b()I

    move-result v10

    .line 85
    :cond_5
    add-int/lit8 v12, v12, 0x1

    goto :goto_1

    .line 92
    :cond_6
    const/4 v12, 0x0

    :goto_2
    if-ge v12, v6, :cond_7

    .line 93
    invoke-interface {v5, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lo/dvm;

    .line 94
    invoke-static {v13, v11}, Lo/dyj;->a(Lo/dvm;I)Lo/dzd;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    add-int/lit8 v12, v12, 0x1

    goto :goto_2

    .line 96
    :cond_7
    invoke-static {v2, v10, v11}, Lo/dyj;->c(Lo/dvj;II)Lo/dzj;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/dzc;->b(Lo/dzj;)V

    .line 97
    invoke-virtual {v8, v9}, Lo/dzc;->b(Ljava/util/ArrayList;)V

    .line 98
    const-string v0, "levelLocationRelationShipData"

    invoke-virtual {v8}, Lo/dzc;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    return-object v8
.end method

.method public static c(Lo/dvj;II)Lo/dzj;
    .locals 6

    .line 129
    new-instance v1, Lo/dzj;

    invoke-direct {v1}, Lo/dzj;-><init>()V

    .line 130
    invoke-virtual {p0}, Lo/dvj;->b()I

    move-result v2

    .line 131
    invoke-static {v2}, Lo/dzt;->e(I)I

    move-result v3

    .line 132
    invoke-virtual {v1, v3}, Lo/dzj;->d(I)V

    .line 133
    invoke-static {p1, p2}, Lo/dzt;->c(II)I

    move-result v0

    invoke-virtual {v1, v0}, Lo/dzj;->c(I)V

    .line 134
    add-int/lit8 v0, v3, 0x1

    invoke-static {v0}, Lo/dzt;->a(I)I

    move-result v4

    .line 135
    invoke-static {v3}, Lo/dzt;->a(I)I

    move-result v5

    .line 137
    sub-int v0, v4, v5

    invoke-virtual {v1, v0}, Lo/dzj;->b(I)V

    .line 138
    sub-int v0, v2, v5

    invoke-virtual {v1, v0}, Lo/dzj;->e(I)V

    .line 139
    return-object v1
.end method
