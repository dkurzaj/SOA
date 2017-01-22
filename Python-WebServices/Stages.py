from collections import OrderedDict
import json

def stage(id, stage_date, description, duree, lieu, titre, entreprise):
	d = OrderedDict()
	for p, q in zip(['id', 'stage_date', 'description', 'duree', 'lieu', 'titre', 'entreprise'], 
				[id, stage_date, description, duree, lieu, titre, entreprise]):
		d[p] = q
	return d


offres_stage_thales = [
	stage(	id = 0,
			stage_date = "2016-11-24", 
			description = "Vous manipulerez pleins de données !", 
			duree = 4, 
			lieu = "Toulouse", 
			titre = "Stage de Bigdata", 
			entreprise = 1),
	stage(	id = 1,
			stage_date = "2016-04-01", 
			description = "Vous aurez la tête dans les nuages !", 
			duree = 6, 
			lieu = "Toulouse", 
			titre = "Stage de Cloud Computing", 
			entreprise = 1),
	stage(	id = 2,
			stage_date = "2016-02-15", 
			description = "Lol des maths...", 
			duree = 6, 
			lieu = "Toulouse", 
			titre = "Stage de Statistiques", 
			entreprise = 1),
	stage(	id = 3,
			stage_date = "2016-02-01", 
			description = "Angular, CSS, tout ça, tout ça...", 
			duree = 4, 
			lieu = "Montpellier", 
			titre = "Stage de Web Services", 
			entreprise = 1)]


offres_stage_airbus = [
	stage(	id = 0,
			stage_date = "2016-11-24", 
			description = "Le béton c'est bon !", 
			duree = 4, 
			lieu = "Toulouse", 
			titre = "Stage de conception de béton", 
			entreprise = 1),
	stage(	id = 1,
			stage_date = "2016-04-01", 
			description = "Vous relierez le continent australien au continent asiatique.", 
			duree = 6, 
			lieu = "Toulouse", 
			titre = "Stage de construction d'un pont", 
			entreprise = 1),
	stage(	id = 2,
			stage_date = "2016-02-15", 
			description = "On parle pas de la grande surface mdr.", 
			duree = 6, 
			lieu = "Toulouse", 
			titre = "Stage de création d'un carrefour", 
			entreprise = 1),
	stage(	id = 3,
			stage_date = "2016-02-01", 
			description = "On a beaucoup de... choses à dissimuler...", 
			duree = 4, 
			lieu = "Montpellier", 
			titre = "Stage de creusage d'un gros trou", 
			entreprise = 1)]

"""
offres_stage_airbus = json.dumps([         {"id":0,
                                "stage_date":"2016-11-24",
                                "description":"Le béton c'est bon !",
                                "duree":4,
                                "lieu":"Toulouse",
                                "titre":"Stage de conception de béton",
                                "entreprise":1},

                                {"id":1,
                                "stage_date":"2016-04-01",
                                "description":"Vous relierez le continent australien au continent asiatique.",
                                "duree":6,
                                "lieu":"Toulouse",
                                "titre":"Stage de construction d'un pont",
                                "entreprise":1},

                                {"id":2,
                                "stage_date":"2016-02-15",
                                "description":"On parle pas de la grande surface mdr.",
                                "duree":6,
                                "lieu":"Toulouse",
                                "titre":"Stage de création d'un carrefour",
                                "entreprise":1},

                                {"id":3,
                                "stage_date":"2016-02-01",
                                "description":"On a beaucoup de... choses à dissimuler...",
                                "duree":4,
                                "lieu":"Montpellier",
                                "titre":"Stage de creusage d'un gros trou",
                                "entreprise":1}
                            ])"""